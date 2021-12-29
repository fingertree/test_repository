package cn.test.entity;

/**
 * @ClassName: GroupBrandCateBO
 * @Author: xiaochen
 * @date: 2021/12/29 21:19
 * @Version: V 1.0
 */

public class GroupBrandCateBO {
    private String version;
    private String groupCode;
    private String bet;
    public GroupBrandCateBO(){};
    public GroupBrandCateBO(String version,String groupCode,String bet){
        this.version = version;
        this.groupCode = groupCode;
        this.bet = bet;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getBet() {
        return bet;
    }

    public void setBet(String bet) {
        this.bet = bet;
    }
}
