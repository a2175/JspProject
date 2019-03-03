package team;
import myapp.UserBean;

import java.util.ArrayList;

public interface MainDAO {
		public void addMain(MainBean main);
		public ArrayList<MainBean> getMain(int page);
		public ArrayList<MainBean> getLikemain(String id);
		public int correctPw(UserBean pw, UserBean new_pw);
		public int correctPh(UserBean ph, UserBean new_ph);
		public int addLike(MainBean like);
}
