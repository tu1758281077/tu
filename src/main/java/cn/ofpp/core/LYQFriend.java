package cn.ofpp.core;


public class LYQFriend extends Friend {

    public LYQFriend(String fullName, String province, String city, String birthday, String loveTime, String userId) {
        super(fullName, province, city, userId, birthday, loveTime, "男");
    }

    public LYQFriend(String fullName, String province, String city, String birthday, String loveTime, String userId, String templateId) {
        super(fullName, province, city, userId, birthday, loveTime, "男", templateId);
    }


}
