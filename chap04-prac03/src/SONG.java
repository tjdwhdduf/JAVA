
public class SONG {
		private String title;
		private String artist;
		private int year;
		private String country;
		
		public SONG() {}
		public SONG(String title, String artist, int year, String country){
				this.title = title;
				this.artist = artist;
				this.year = year;
				this.country = country;
		}
		
		public void show(){
				System.out.print(year + "�� ");
				System.out.print(country + "������ ");
				System.out.print(artist + "�� �θ� ");
				System.out.println(title);
		}
		public static void main(String[] args) {
				SONG myFavorite = new SONG("Dancing Queen","ABBA",1978, "������");
				
				myFavorite.show();
		}
}