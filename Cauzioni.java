/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package multe;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.*;


/**
 *
 * @author Carlo
 */
public class Cauzioni extends javax.swing.JFrame {
    public Auto[] Macchine;
    DefaultListModel defaultListModel=new DefaultListModel();
    String searchTerm;
    String TempModel;
    int i,tempval;
    
    public Cauzioni() {
        initComponents();
        this.blindData();
        Macchine=new Auto[193];
        i=0;
        tempval=0;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("locale.png")));
    }
    private ArrayList getCar(){
        ArrayList cars=new ArrayList();
        cars.add("Alfa Romeo");
        cars.add("Aston Martin");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Bentley");
        cars.add("Bugatti");
        cars.add("Dodge");
        cars.add("Ducati");
        cars.add("FIAT");
        cars.add("Ferrari");
        cars.add("Ford");
        cars.add("Harley Davison");
        cars.add("Honda");
        cars.add("Hummer");
        cars.add("Isuzu");
        cars.add("Iveco");
        cars.add("Jaguar");
        cars.add("Jeep");
        cars.add("KTM");
        cars.add("Kawasaki");
        cars.add("Lamborghini");
        cars.add("Lancia");
        cars.add("Land Rover");
        cars.add("Lotus");
        cars.add("Lykan");
        cars.add("Maserati");
        cars.add("Mercedes-Benz");
        cars.add("Mitsubishi");
        cars.add("Nissan");
        cars.add("Piaggio");
        cars.add("Porsche");
        cars.add("Renault");
        cars.add("Rolls Royce");
        cars.add("Seat");
        cars.add("Subaru");
        cars.add("Tesla");
        cars.add("Toyota");
        cars.add("Volkswagen");
        cars.add("Volvo");
        cars.add("Yamaha");
        return cars;
    }
    
    private void blindData(){
        getCar().stream().forEach((car)->{
           defaultListModel.addElement(car);
        });
        Lista1.setModel(defaultListModel);
        Lista1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void searchFilter(String searchTerm){
        
        DefaultListModel filteredItems=new DefaultListModel();
        ArrayList cars=getCar();
        
        cars.stream().forEach((car)->{
            String carName=car.toString().toLowerCase();
            if(carName.contains(searchTerm.toLowerCase())){
                filteredItems.addElement(car);
            }
        });
        defaultListModel=filteredItems;
        Lista1.setModel(defaultListModel);
    }
    
    public void load(){
        Macchine[0]=new Auto("Alfa Romeo","6 Underground","200.000",375);
        Macchine[1]=new Auto("Alfa Romeo","147","10.000",80);
        Macchine[2]=new Auto("Alfa Romeo","155","7.000",100);
        Macchine[3]=new Auto("Alfa Romeo","156","9.000",120);
        Macchine[4]=new Auto("Alfa Romeo","159","35.000",140);
        Macchine[5]=new Auto("Alfa Romeo","159SW","40.000",140);
        Macchine[6]=new Auto("Alfa Romeo","166","12.000",120);
        Macchine[7]=new Auto("Alfa Romeo","75","7.000",120);
        Macchine[8]=new Auto("Alfa Romeo","Giulia GTA","470.000",400);
        Macchine[9]=new Auto("Alfa Romeo","Giulia Quadrifoglio","55.000",375);
        Macchine[10]=new Auto("Alfa Romeo","Giulia veloce","40.000",200);
        Macchine[11]=new Auto("Alfa Romeo","Giulietta","35.000",120);
        Macchine[12]=new Auto("Alfa Romeo","Mito","20.000",60);
        Macchine[13]=new Auto("Alfa Romeo","Stelvio","70.000",375);
        Macchine[14]=new Auto("Alfa Romeo","Tonale","400.000",425);
        Macchine[15]=new Auto("Aston Martin","Valhalla","2.750.000",750);
        Macchine[16]=new Auto("Aston Martin","Vanquish","280.000",425);
        Macchine[17]=new Auto("Aston Martin","Vantage","200.000",375);
        Macchine[18]=new Auto("Audi","A4","65.000",250);
        Macchine[19]=new Auto("Audi","A82020","130.000",350);
        Macchine[20]=new Auto("Audi","A8","100.000",300);
        Macchine[21]=new Auto("Audi","Q7","110.000",325);
        Macchine[22]=new Auto("Audi","Q8","160.000",325);
        Macchine[23]=new Auto("Audi","R8","500.000",455);
        Macchine[24]=new Auto("Audi","RS3","70.000",250);
        Macchine[25]=new Auto("Audi","RS6 Nuova","152.000",425);
        Macchine[26]=new Auto("Audi","RS6 Vecchia","120.000",375);
        Macchine[27]=new Auto("Audi","RS7","166.000",425);
        Macchine[28]=new Auto("Audi","TTS","61.000",225);
        Macchine[29]=new Auto("Bentley","Bentayga","275.000",400);
        Macchine[30]=new Auto("Bentley","Continental GT Nuovo","300.000",400);
        Macchine[31]=new Auto("Bentley","Continental GT Vecchio","250.000",400);
        Macchine[32]=new Auto("BMW","320","70.000",200);
        Macchine[33]=new Auto("BMW","530","80.000",250);
        Macchine[34]=new Auto("BMW","760I","85.000",425);
        Macchine[35]=new Auto("BMW","Alpina b7","200.000",450);
        Macchine[36]=new Auto("BMW","M1","200.000",235);
        Macchine[37]=new Auto("BMW","M3 E63 1992","100.000",160);
        Macchine[38]=new Auto("BMW","M3 Manhart","320.000",600);
        Macchine[39]=new Auto("BMW","M4","170.000",400);
        Macchine[40]=new Auto("BMW","M5 CS","220.000",500);
        Macchine[41]=new Auto("BMW","M8","195.000",450);
        Macchine[42]=new Auto("BMW","S1000 RR","27.000",150);
        Macchine[43]=new Auto("BMW","Serie 3 E46","18.000",200);
        Macchine[44]=new Auto("BMW","Serie 5 E60","95.000",325);
        Macchine[45]=new Auto("BMW","X5","200.000",245);
        Macchine[46]=new Auto("BMW","X6 M","105.000",400);
        Macchine[47]=new Auto("BMW","X6 MF16","170.000",425);
        Macchine[48]=new Auto("BMW","X7","200.000",290);
        Macchine[49]=new Auto("BMW","i3","35.000",140);
        Macchine[50]=new Auto("BMW","i8","175.000",250);
        Macchine[51]=new Auto("Bugatti","Chiron","2.000.000",1200);
        Macchine[52]=new Auto("Bugatti","W16","2.000.000",730);
        Macchine[53]=new Auto("Dodge","Viper","500.000",480);
        Macchine[54]=new Auto("Ducati","Multistrada 1.200","30000",100);
        Macchine[55]=new Auto("Ducati","Panigale","25.000",160);
        Macchine[56]=new Auto("Ducati","Panigale V4Speciale","35.000",160);
        Macchine[57]=new Auto("Ferrari","355","420.000",300);
        Macchine[58]=new Auto("Ferrari","458 Italia","280.000",425);
        Macchine[59]=new Auto("Ferrari","488 Spider","260.000",475);
        Macchine[60]=new Auto("Ferrari","599 GTO","650.000",450);
        Macchine[61]=new Auto("Ferrari","812","450.000",575);
        Macchine[62]=new Auto("Ferrari","California","430.000",375);
        Macchine[63]=new Auto("Ferrari","Enzo","1.500.000",485);
        Macchine[64]=new Auto("Ferrari","F12","295.000",550);
        Macchine[65]=new Auto("Ferrari","F40","1.000.000",350);
        Macchine[66]=new Auto("Ferrari","F430","360.000",375);
        Macchine[67]=new Auto("Ferrari","F8 Tributo","2.000.000",530);
        Macchine[68]=new Auto("Ferrari","FXX","3.000.000",140);
        Macchine[69]=new Auto("Ferrari","LaFerrari","1.500.000",700);
        Macchine[70]=new Auto("Ferrari","Monza","970.000",600);
        Macchine[71]=new Auto("Ferrari","Portofino","2.000.000",440);
        Macchine[72]=new Auto("Ferrari","Roma","355.000",450);
        Macchine[73]=new Auto("FIAT","500 Abarth","15.000",15);
        Macchine[74]=new Auto("FIAT","500 AbarthB","10.000",15);
        Macchine[75]=new Auto("FIAT","500 Nuova","20.000",80);
        Macchine[76]=new Auto("FIAT","500e","37.000",60);
        Macchine[77]=new Auto("FIAT","500x","32.000",120);
        Macchine[78]=new Auto("FIAT","Bravo","20.000",120);
        Macchine[79]=new Auto("FIAT","Doblo","30.000",80);
        Macchine[80]=new Auto("FIAT","Ducato","40.000",100);
        Macchine[81]=new Auto("FIAT","Ducato con pianale","35.000",100);
        Macchine[82]=new Auto("FIAT","Freemont","30.000",100);
        Macchine[83]=new Auto("FIAT","Fullback","38.000",140);
        Macchine[84]=new Auto("FIAT","Nuova Panda","17.000",70);
        Macchine[85]=new Auto("FIAT","Panda 1991","6.000",30);
        Macchine[86]=new Auto("FIAT","Panda 2008","8.000",60);
        Macchine[87]=new Auto("FIAT","Punto 2003","7.500",60);
        Macchine[88]=new Auto("FIAT","Punto","20.000",70);
        Macchine[89]=new Auto("FIAT","Stilo","5.000",60);
        Macchine[90]=new Auto("FIAT","Tipo","15.000",70);
        Macchine[91]=new Auto("Ford","GT","1.000.000",450);
        Macchine[92]=new Auto("Ford","Mustang Fastback","60.000",325);
        Macchine[93]=new Auto("Harley Davison","FLHX ABS","35.000",60);
        Macchine[94]=new Auto("Harley Davison","FatBoy","37.000",60);
        Macchine[95]=new Auto("Harley Davison","NightRod Special 2013","34.000",100);
        Macchine[96]=new Auto("Harley Davison","Slave","37.000",60);
        Macchine[97]=new Auto("Harley Davison","StreetKing","37.000",60);
        Macchine[98]=new Auto("Honda","CB500X","10.000",40);
        Macchine[99]=new Auto("Honda","CR450R Special","17.000",40);
        Macchine[100]=new Auto("Honda","CRF450","15.000",40);
        Macchine[101]=new Auto("Hummer","H3 Aperto","70.000",250);
        Macchine[102]=new Auto("Hummer","H3 Chiuso","75.000",250);
        Macchine[103]=new Auto("Isuzu","D-Max","33.000",120);
        Macchine[104]=new Auto("Iveco","Frigo","38.000",120);
        Macchine[105]=new Auto("Jaguar","F-Pace 300 Sport","95.000",275);
        Macchine[106]=new Auto("Jaguar","XJ","230.000",400);
        Macchine[107]=new Auto("Jeep","Grand Cherokee","80.000",200);
        Macchine[108]=new Auto("Jeep","Renegade","60.000",140);
        Macchine[109]=new Auto("Jeep","Wrangler","40.000",200);
        Macchine[110]=new Auto("Kawasaki","Eliminator","37.000",40);
        Macchine[111]=new Auto("Kawasaki","KX450F","18.000",40);
        Macchine[112]=new Auto("Kawasaki","ZX10R","28.000",140);
        Macchine[113]=new Auto("KTM","EXC530 Enduro","20.000",40);
        Macchine[114]=new Auto("KTM","EXC530 Supermoto","25.000",40);
        Macchine[115]=new Auto("Lamborghini","Aventador","2.000.000",515);
        Macchine[116]=new Auto("Lamborghini","Centenario","1.700.000",575);
        Macchine[117]=new Auto("Lamborghini","Gallardo","340.000",400);
        Macchine[118]=new Auto("Lamborghini","Huracan","450.000",450);
        Macchine[119]=new Auto("Lamborghini","Millenium","2.000.000",390);
        Macchine[120]=new Auto("Lamborghini","Murcielago","1.700.000",500);
        Macchine[121]=new Auto("Lamborghini","Performante","1.000.000",470);
        Macchine[122]=new Auto("Lamborghini","Sian Roadster","2.000.000",600);
        Macchine[123]=new Auto("Lamborghini","Urus","270.000",475);
        Macchine[124]=new Auto("Lamborghini","Veneno","3.300.000",550);
        Macchine[125]=new Auto("Lancia","Delta","24.000",120);
        Macchine[126]=new Auto("Lancia","Thema","90.000",225);
        Macchine[127]=new Auto("Lancia","Thesis","15.000",130);
        Macchine[128]=new Auto("Land Rover","Defender","15.000",100);
        Macchine[129]=new Auto("Land Rover","Discovery Sport","40.000",200);
        Macchine[130]=new Auto("Land Rover","RR Velar","200.000",405);
        Macchine[131]=new Auto("Land Rover","RR Vogue","200.000",210);
        Macchine[132]=new Auto("Lotus","Evora","295.000",325);
        Macchine[133]=new Auto("Lykan","HyperSport","2.000.000",550);
        Macchine[134]=new Auto("Maserati","Gran Turismo S","200.000",330);
        Macchine[135]=new Auto("Maserati","Levante","85.000",300);
        Macchine[136]=new Auto("Maserati","Quattroporte","107.000",400);
        Macchine[137]=new Auto("McLaren","675 LT Coupe","1.500.000",496);
        Macchine[138]=new Auto("McLaren","P1","2.000.000",590);
        Macchine[139]=new Auto("Mercedes-Benz","A45s AMG","85.000",300);
        Macchine[140]=new Auto("Mercedes-Benz","AMG GT63","230.000",425);
        Macchine[141]=new Auto("Mercedes-Benz","AMG GT","250.000",425);
        Macchine[142]=new Auto("Mercedes-Benz","Classe C63","85.000",325);
        Macchine[143]=new Auto("Mercedes-Benz","Classe C63s","115.000",375);
        Macchine[144]=new Auto("Mercedes-Benz","G63 AMG","170.000",400);
        Macchine[145]=new Auto("Mercedes-Benz","GLE Coupe","160.000",300);
        Macchine[146]=new Auto("Mercedes-Benz","S500","90.000",325);
        Macchine[147]=new Auto("Mercedes-Benz","SLS AMG","260.000",400);
        Macchine[148]=new Auto("Mercedes-Benz","Vito","40.000",90);
        Macchine[149]=new Auto("Mercedes-Benz","Vito Tourer","40.000",100);
        Macchine[150]=new Auto("Mercedes-Benz","e63s","160.000",450);
        Macchine[151]=new Auto("Mitsubishi","Lancer Evolution","200.000",200);
        Macchine[152]=new Auto("Nissan","370z","90.000",250);
        Macchine[153]=new Auto("Nissan","GT-R","120.000",350);
        Macchine[154]=new Auto("Nissan","GTR LW","500.000",420);
        Macchine[155]=new Auto("Nissan","Skyline GT-R","90.000",250);
        Macchine[156]=new Auto("Pagani","Zonda","2.000.000",445);
        Macchine[157]=new Auto("Piaggio","Ape 50","5.000",10);
        Macchine[158]=new Auto("Piaggio","Vespa 125","7.000",20);
        Macchine[159]=new Auto("Porsche","911 R","180.000",350);
        Macchine[160]=new Auto("Porsche","911 Turbo2021","358.000",475);
        Macchine[161]=new Auto("Porsche","918 Spyder","2.000.000",450);
        Macchine[162]=new Auto("Porsche","Cayenne S","90.000",325);
        Macchine[163]=new Auto("Porsche","Cayenne Turbo","150.000",400);
        Macchine[164]=new Auto("Porsche","Macan","110.000",300);
        Macchine[165]=new Auto("Porsche","Panamera","110.000",325);
        Macchine[166]=new Auto("Porsche","Taycan Turbo S","200.000",270);
        Macchine[167]=new Auto("Renault","Clio IV","15.000",80);
        Macchine[168]=new Auto("Renault","Clio Williams","10.000",140);
        Macchine[169]=new Auto("Renault","Twingo","5.000",60);
        Macchine[170]=new Auto("Rolls Royce","Cullinan","485.000",425);
        Macchine[171]=new Auto("Rolls Royce","Ghost","350.000",450);
        Macchine[172]=new Auto("Rolls Royce","Phantom","550.000",425);
        Macchine[173]=new Auto("Rolls Royce","Wraith","450.000",450);
        Macchine[174]=new Auto("Seat","Leon","20.000",80);
        Macchine[175]=new Auto("Subaru","Forester","40.000",140);
        Macchine[176]=new Auto("Subaru","Forester VI","45.000",140);
        Macchine[177]=new Auto("Subaru","Impreza","200.000",85);
        Macchine[178]=new Auto("Tesla","Model SP100D","200.000",160);
        Macchine[179]=new Auto("Tesla","Model SP90D","200.000",345);
        Macchine[180]=new Auto("Tesla","Model X","127.000",200);
        Macchine[181]=new Auto("Toyota","Prius","7.000",80);
        Macchine[182]=new Auto("Toyota","Supra","200.000",190);
        Macchine[183]=new Auto("Toyota","Yaris GR","25.000",180);
        Macchine[184]=new Auto("Volkswagen","Amarok","35.000",120);
        Macchine[185]=new Auto("Volkswagen","Golf 2a serie","10.000",60);
        Macchine[186]=new Auto("Volkswagen","Golf 7 FaceliftR","63.000",120);
        Macchine[187]=new Auto("Volkswagen","Golf 8 GTI","80.000",200);
        Macchine[188]=new Auto("Volkswagen","Passat","30.000",140);
        Macchine[189]=new Auto("Volvo","V90","58.000",180);
        Macchine[190]=new Auto("Yamaha","Booster MBK","3.000",20);
        Macchine[191]=new Auto("Yamaha","Tenere 700 2019","30.000",60);
        Macchine[192]=new Auto("Yamaha","YZ250","17.000",20);
    }
    
    public void searchDown(){
        int i, val;
        
        DefaultListModel Str = new DefaultListModel();
        for(i=0;i<=193;i++){
            val = Lista1.getSelectedValue().compareTo(Macchine[i].Marca);
            if(0==val){
                Str.addElement(Macchine[i].Modello);
                defaultListModel=Str;
                Lista2.setModel(defaultListModel);
            }else{
                
            }
        }
        Str.removeAllElements();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guidapericolosa = new javax.swing.JCheckBox();
        sosta = new javax.swing.JCheckBox();
        bollo = new javax.swing.JCheckBox();
        testo1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista2 = new javax.swing.JList<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        marchio = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        prezzo = new javax.swing.JLabel();
        sviluppo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        costo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Polizia Locale Milano");
        setBackground(new java.awt.Color(204, 255, 204));
        setResizable(false);

        guidapericolosa.setText("GUIDA PERICOLOSA  ");
        guidapericolosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guidapericolosaActionPerformed(evt);
            }
        });

        sosta.setText("DIVIETO DI SOSTA O ABBANDONO  ");
        sosta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sostaActionPerformed(evt);
            }
        });

        bollo.setText("SEQUESTRO CAUSA MANCATO BOLLO  ");
        bollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolloActionPerformed(evt);
            }
        });

        testo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testo1ActionPerformed(evt);
            }
        });
        testo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                testo1search(evt);
            }
        });

        Lista1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Lista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lista1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Lista1);

        Lista2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Lista2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lista2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Lista2);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inserisci la marca");

        jLabel2.setText("Marchio:");

        jLabel3.setText("Modello:");

        jLabel4.setText("Prezzo: €");

        jLabel5.setText("Sviluppo Kw:");

        marchio.setText("            ");

        model.setText("            ");

        prezzo.setText("            ");

        sviluppo.setText("            ");

        jLabel6.setText("Cauzione: €");

        costo.setText("            ");

        jLabel7.setText("Dal vostro Cipr3sso<3");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multe/Milano1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(testo1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bollo)
                    .addComponent(sosta)
                    .addComponent(guidapericolosa))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marchio)
                            .addComponent(prezzo)
                            .addComponent(model)
                            .addComponent(sviluppo)
                            .addComponent(costo)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(testo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guidapericolosa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sosta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bollo)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(marchio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(model))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(prezzo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sviluppo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(costo))
                        .addGap(57, 57, 57))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guidapericolosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guidapericolosaActionPerformed
        if(Lista2.getSelectedValue()==null){
            
        }else{
            if(guidapericolosa.isSelected()){
                tempval=tempval+600;
            }else{
                tempval=tempval-600;
            }
            costo.setText(tempval+"");
        }
    }//GEN-LAST:event_guidapericolosaActionPerformed

    private void testo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testo1ActionPerformed

    }//GEN-LAST:event_testo1ActionPerformed

    private void testo1search(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_testo1search
        searchFilter(testo1.getText());
       
    }//GEN-LAST:event_testo1search

    private void Lista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lista1MouseClicked
        load();
        searchDown();
    }//GEN-LAST:event_Lista1MouseClicked

    private void Lista2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lista2MouseClicked
        guidapericolosa.setSelected(false);
        sosta.setSelected(false);
        bollo.setSelected(false);
        for(i=0;i<=193;i++){
            if(0==Lista2.getSelectedValue().compareTo(Macchine[i].Modello)){
                marchio.setText(Macchine[i].Marca);
                model.setText(Macchine[i].Modello);
                prezzo.setText(Macchine[i].Prezzo+"");
                sviluppo.setText(Macchine[i].Kw+"");
                if(Macchine[i].Kw>200){
                    tempval=(Macchine[i].Kw-200)*40;
                }else{
                    tempval=(Macchine[i].Kw*5);
                    if (tempval>1000){
                        tempval=1000;
                    }
                    
                }
            }
            costo.setText(tempval+"");
        }
        
    }//GEN-LAST:event_Lista2MouseClicked

    private void sostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sostaActionPerformed
        if(Lista2.getSelectedValue()==null){
            
        }else{
            if(sosta.isSelected()){
                tempval=tempval+500;
            }else{
                tempval=tempval-500;
            }
            costo.setText(tempval+"");
        }
    }//GEN-LAST:event_sostaActionPerformed

    private void bolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolloActionPerformed
        if(Lista2.getSelectedValue()==null){
            
        }else{
            if(bollo.isSelected()){
                tempval=tempval+200;
            }else{
                tempval=tempval-200;
            }
            costo.setText(tempval+"");
        }
    }//GEN-LAST:event_bolloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cauzioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cauzioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cauzioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cauzioni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cauzioni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista1;
    private javax.swing.JList<String> Lista2;
    private javax.swing.JCheckBox bollo;
    private javax.swing.JLabel costo;
    private javax.swing.JCheckBox guidapericolosa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel marchio;
    private javax.swing.JLabel model;
    private javax.swing.JLabel prezzo;
    private javax.swing.JCheckBox sosta;
    private javax.swing.JLabel sviluppo;
    private javax.swing.JTextField testo1;
    // End of variables declaration//GEN-END:variables
}
