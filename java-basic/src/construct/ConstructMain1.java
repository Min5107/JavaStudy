package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct memberConstruct1 = new MemberConstruct("user1", 15,90);
        MemberConstruct memberConstruct2 = new MemberConstruct("user2", 16,80);

        MemberConstruct[] memberConstructs = {memberConstruct1, memberConstruct2};

        for (MemberConstruct memberConstruct : memberConstructs) {
            System.out.println("name : " + memberConstruct.name + " age : " + memberConstruct.age + " grade : " + memberConstruct.grade);
        }
    }
}
