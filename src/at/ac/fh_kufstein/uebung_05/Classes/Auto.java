package at.ac.fh_kufstein.uebung_05.Classes;

    public class Auto extends Fahrzeug
    {
        private boolean klimaanlage;
        private short airbag;

        public void klimaanlageAn()
        {
            if(this.klimaanlage==true)
            {
                System.out.println("Klimaanlage ist bereits an.");
            }
            else
            {
                this.klimaanlage = true;
            }
        }

        public void klimaanlageAus()
        {
            if(this.klimaanlage==false)
            {
                System.out.println("Klimaanlage ist bereits aus.");
            }
            else
            {
                this.klimaanlage = false;

            }
        }
        // Aufgabe 3

        public boolean getKlimaanlage() {
            return klimaanlage;
        }

        public void setKlimaanlage(boolean klimaanlage) {
            this.klimaanlage = klimaanlage;
        }

        public short getAirbag() {
            return airbag;
        }

        public void setAirbag(short airbag) {
            this.airbag = airbag;
        }

        // Aufgabe 4

        public Auto( short airbag, short reifen, String color, short ps, short tueren, short geschwindigkeit, int anzahl) {
            super(reifen, color, ps, tueren, geschwindigkeit);
            this.klimaanlage = false;
            this.airbag = airbag;
        }
    }
