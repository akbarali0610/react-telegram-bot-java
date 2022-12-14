package uz.akbarali.foodbotwithreact.bot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.akbarali.foodbotwithreact.bot.dto.UserActivityDto;
import uz.akbarali.foodbotwithreact.bot.util.UserUtil;
import uz.akbarali.foodbotwithreact.model.UserActivity;
import uz.akbarali.foodbotwithreact.repository.UserActivityRepository;
import uz.akbarali.foodbotwithreact.repository.UserRepository;

import java.util.Map;
import java.util.Optional;

@Service
public class UserManageService {
    @Autowired
    UserUtil userUtil;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserActivityRepository userActivityRepository;

    public void manage(Update update, SendMessage sendMessage,
                       EditMessageText editMessageText, DeleteMessage deleteMessage,
                       SendLocation sendLocation, SendPhoto sendPhoto, SendDocument sendDocument){
        if (update.hasMessage() || update.hasCallbackQuery()) {

        }
    }

//    public User isAlreadyExist(Long chatId) {
//        Optional<User> byChatId = userRepository.findByChatId(chatId);
//        if (byChatId.isPresent()) {
//            return userRepository.findByChatId(chatId).get();
//        }
//        return null;
//    }

    public UserActivityDto alreadyExist(Long chatId) {
         Map<Long, UserActivityDto> activityMap = userUtil.activityMap;
        if (activityMap.containsKey(chatId)) {
            return activityMap.get(chatId);
        }
        return null;
    }

//    public UserActivityDto alreadyExistDb(Long chatId, Map<Long, UserActivityDto> activityMap){
//        userActivityRepository.
//    }


}
