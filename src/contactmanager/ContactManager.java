package contactmanager;

public class ContactManager {
    //Fields
    Contact [] myFriends; //nyiapin struct
    int friendCount;
    
    //Constructor
    ContactManager(){
        friendCount=0;
        myFriends= new Contact[100]; //kaya struct
    }
    
    //Method untuk add cont
    void addContact(Contact contact){
        myFriends[friendCount]=contact;
        friendCount++;
    }
    
    //Method untuk search cont
    Contact searchContact(String searchName){ //string nama class,
        
        for (int i=0;i<friendCount;i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
