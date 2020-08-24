package sqldev_create_user;

public class sqldev_create_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		create user test identified by 1111;
		alter user test account unlock;
		grant connect, resource to test;
		commit;
	}

}
