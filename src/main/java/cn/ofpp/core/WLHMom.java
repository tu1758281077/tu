package cn.ofpp.core;


public class   WLHMom extends Friend {

    public WLHMom(String fullName, String province, String city, String birthday, String loveTime, String userId) {
        super(fullName, province, city, userId, birthday, loveTime, "男");
    }

    public WLHMom(String fullName, String province, String city, String birthday, String loveTime, String userId, String templateId) {
        super(fullName, province, city, userId, birthday, loveTime, "男", templateId);
    }


}
