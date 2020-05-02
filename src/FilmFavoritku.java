public class FilmFavoritku {
        public static void main(String[] args) {
            System.out.println("Film Favoritku");
            System.out.println("**********************************");
            Film film1 = new Film();
            film1.Genre = "Adventure, Mystery, Comedy";
            film1.Tahun = 2011;
            film1.Negara = "Korea";
            film1.Judul = "Detective K : Secret Of Virtuous Widow";
            film1.Rating = 7.3;
            film1.cetakInfo();

            System.out.println("================================");

            Film film2 = new Film();
            film2.Genre = "Action, Crime, Thriller";
            film2.Tahun = 2010;
            film2.Negara = "Korea";
            film2.Judul = "The Man From Nowhere";
            film2.Rating = 7.6;
            film2.cetakInfo();

            System.out.println("================================");

            Film film3 = new Film();
            film3.Genre = "Action, Comedy";
            film3.Tahun = 2017;
            film3.Negara = "Korea";
            film3.Judul = "Midnight Runners";
            film3.Rating = 7.6;
            film3.cetakInfo();

            System.out.println("================================");
        }
    }

