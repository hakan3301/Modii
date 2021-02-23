package hknmodi.com.Matches;

public class MatchesObject {
    private String userId;
    private String name;
    private String profileImageUrl;
    public MatchesObject(String id, String name, String userId){
        this.userId = userId;
        this.name = this.name;
        this.profileImageUrl = profileImageUrl;
    }

    public String getUserId(){
        return userId;
    }
    public void setUserID(String userID){
        this.userId = userId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getProfileImageUrl(){
        return profileImageUrl;
    }
    public void setProfileImageUrl(String profileImageUrl){
        this.profileImageUrl = profileImageUrl;
    }
}