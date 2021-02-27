package creational.factory;

public abstract class SocialMedia {

    private String mediaName;
    private String accountId;

    public String getMediaName() {
        return mediaName;
    }

    public String getMyAccountId() {
        return accountId;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
