package xmcl;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
// import com.microsoft.azure.functions.annotation.BindingName;
// import com.microsoft.azure.functions.annotation.BlobTrigger;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

// import net.mamoe.mirai.Bot;
// import net.mamoe.mirai.BotFactory;
// import net.mamoe.mirai.contact.Group;
// import net.mamoe.mirai.contact.announcement.AnnouncementParametersBuilder;
// import net.mamoe.mirai.contact.announcement.Announcements;
// import net.mamoe.mirai.contact.announcement.OfflineAnnouncement;
// import net.mamoe.mirai.contact.announcement.OnlineAnnouncement;

// import java.util.Objects;
import java.util.Optional;

/**
 * Azure Functions with HTTP Trigger.
 */
public class Function {
    @FunctionName("release-trigger")
    public String trigger(
            @HttpTrigger(name = "release-trigger", methods = {
                    HttpMethod.GET }, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
                    final ExecutionContext context) {
        context.getLogger().info("HELLO");
        return "Hello";
    }

    // /**
    //  * This function listens at endpoint "/api/release". Two ways to invoke it using
    //  * "curl" command in bash:
    //  * 1. curl -d "HTTP Body" {your host}/api/release
    //  * 2. curl "{your host}/api/release?name=HTTP%20Query"
    //  */
    // @FunctionName("release")
    // public void run(
    //         @BlobTrigger(name = "version-released", dataType = "string", path = "releases/{name}", connection = "XMCL_STORAGE_CONNECTION") String content,
    //         @BindingName("name") String filename,
    //         final ExecutionContext context) {
    //     if (!filename.equals("VERSION")) {
    //         context.getLogger().info("??? VERSION ???????????????");
    //         return;
    //     }
    //     context.getLogger().info("VERSION ?????????????????????");

    //     Bot bot = BotFactory.INSTANCE.newBot(Integer.parseInt(System.getenv("QQ")), System.getenv("QQPWD"));
    //     bot.login();

    //     int groupId = 858391850;
    //     Group group = bot.getGroup(groupId);
    //     if (Objects.isNull(group)) {
    //         context.getLogger().warning("The group not found: " + groupId);
    //         return;
    //     }

    //     content = content.trim();

    //     String message = String.format("%s???\n?????????????????????????????????????????? https://xmcl.app ???????????????", content);
    //     context.getLogger().info(message);

    //     Announcements announcements = group.getAnnouncements();
    //     OfflineAnnouncement announcement = OfflineAnnouncement.create(message, new AnnouncementParametersBuilder()
    //             .isPinned(true)
    //             .sendToNewMember(true)
    //             .showPopup(true)
    //             .requireConfirmation(false)
    //             .showEditCard(false)
    //             .build());
    //     OnlineAnnouncement publish = announcements.publish(announcement);

    //     context.getLogger().info(publish.toString());

    //     bot.close();
    // }
}
