package Pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Background extends JPanel{
	
	JFrame frame = new JFrame();
	static BufferedImage resim1,resim2;
	static BufferedImage tas;
	static BufferedImage rocket;
	static BufferedImage flame1,flame2;
	static BufferedImage explosionArray[] = new BufferedImage[16];
	static BufferedImage myPrize1;
	
	
	private int temp=0;
	private int temp1=0;
	private int prizeTemp = 0;
	static int gorsel;
	static int rocketX=300,rocketY=400;
	static int backgroundY1=0,backgroundY2=-500;
	static int tasgroundY1=0;
	static int flameAnimation;
	static int explosionAnimation;
	static int canlý=2,maxCanlý=2;
	static int myHealt=100;
	static int tasHýzlanma=0;
	static int deger1=0,deger2=0,deger3=0;
	
	static JButton btnResume;
	
	static int[] prizeX = new int[5];
	static int[] prizeY = new int[5];
	static int[] tasX = new int[5];
	static int[] tasY = new int[5];
	static int[] tasSpeed = new int[5];
	static int[] prizeSpeed = new int[5];
	
	
	static boolean moveup=false,movedown=false,moveleft=false,moveright=false;
	static boolean carpma = false, kayýp=false,carpma2=false,kayýp2=false;
	static boolean healtKontrol = false;
	static boolean imSpiel=true,imMenü=false;
	
	
	Timer tasZaman;
	
	
	public Background() {
		if(Background.imSpiel){
		try{
			resim1 = ImageIO.read(new File("rsc/Adsýz.png"));
			resim2 = ImageIO.read(new File("rsc/Adsýz.png"));
			tas = ImageIO.read(new File("rsc/Adsýz1.png"));
			rocket = ImageIO.read(new File("rsc/Adsýz2.png"));
			flame1 = ImageIO.read(new File("rsc/ates1.jpg"));
			flame2 = ImageIO.read(new File("rsc/ates2.jpg"));
			myPrize1 = ImageIO.read(new File("rsc/ödül1.png"));
			
	
			for(int i=0;i<=15;i++){
					
				explosionArray[i] = ImageIO.read(new File("rsc/exp"+(i+1)+".png"));
			}
			

		}
		catch(IOException e){
			
			e.printStackTrace();
		}
		
		}
		
		Background.btnResume= new JButton();
		Background.btnResume.setText("Resume");
		Background.btnResume.setBounds(30,50,500,50);
		Background.btnResume.setVisible(true);
		Background.btnResume.addActionListener(new ActionHandler());
		Background.btnResume.setBackground(Color.BLACK);
		Background.btnResume.setFont(new Font("Arial",Font.BOLD,40));
		Background.btnResume.setForeground(Color.WHITE);
		Background.btnResume.setBorder(null);
		Background.btnResume.setFocusPainted(false);
		Background.btnResume.addMouseListener(new MouseAdapter() {
			
			public void mouseClick(MouseEvent e){
				Background.btnResume.setBackground(Color.BLACK);
				Background.btnResume.setForeground(Color.WHITE);
	
			}
			public void mouseExited(MouseEvent e){
				Background.btnResume.setBackground(Color.BLACK);
				Background.btnResume.setForeground(Color.WHITE);

			}
			
		});
		
		
		
		
		repaint();
	}
	
	//public static void userInterface(){
	
	//}
	
	public void tasHýzlanma(){
		

		
		
	
		for(int i=0;i<=4;i++){
			tasHýzlanma = tasHýzlanma+10;
			tasX[i] = temp+20;
			tasY[i] =-200-temp;
			temp=temp+100;
		}
		
		tasZaman = new Timer();
		tasZaman.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Background.imSpiel){
				
				for(int i=0;i<=4;i++){
					
					if(myHealt>=100 && myHealt<150){
						
						tasSpeed[0]=1;
						tasSpeed[1]=2;
						tasSpeed[2]=2;
						tasSpeed[3]=1;
						tasSpeed[4]=2;
						
					}
					
					if(myHealt>150 && myHealt<300){
						
						tasSpeed[0]=3;
						tasSpeed[1]=2;
						tasSpeed[2]=3;
						tasSpeed[3]=4;
						tasSpeed[4]=2;
						
					}
					
				if(myHealt>=300 && myHealt<400){
						
						tasSpeed[0]=4;
						tasSpeed[1]=3;
						tasSpeed[2]=3;
						tasSpeed[3]=4;
						tasSpeed[4]=5;
						
					}
				
				if(myHealt>=400 && myHealt<500){
					
					tasSpeed[0]=4;
					tasSpeed[1]=5;
					tasSpeed[2]=4;
					tasSpeed[3]=4;
					tasSpeed[4]=5;
					
				}
				if(myHealt>=500 && myHealt<800){
					
					tasSpeed[0]=5;
					tasSpeed[1]=5;
					tasSpeed[2]=5;
					tasSpeed[3]=5;
					tasSpeed[4]=6;
					
				}
				if(myHealt>=800 && myHealt<1200){
					
					tasSpeed[0]=7;
					tasSpeed[1]=8;
					tasSpeed[2]=7;
					tasSpeed[3]=8;
					tasSpeed[4]=7;
					
				}
					
					tasY[i]=tasY[i] + tasSpeed[i];
					if(tasY[i] >= Main.setHeight){
						tasY[i]=-100;
					}
					
				}
				
			
			}
			}
		
		}, 0, 10);
		
		
		
	}
	
	public void prizeAnimation(){
		

		
		for(int i=0;i<=4;i++){
			
			prizeX[i] = 10+prizeTemp;
			prizeY[i] = -200-prizeTemp;
			prizeTemp=prizeTemp+150;
		}
		
		Timer prizeAnimation;
		prizeAnimation = new Timer();
		
		prizeAnimation.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if(Background.imSpiel){
					if(Background.myHealt>0 && Background.myHealt<400){
						
						prizeSpeed[0]=4;
						prizeSpeed[1]=4;
						prizeSpeed[2]=3;
						prizeSpeed[3]=2;
						prizeSpeed[4]=3;
					}
					
					if(Background.myHealt>400 && Background.myHealt<800){
						
						prizeSpeed[0]=4;
						prizeSpeed[1]=5;
						prizeSpeed[2]=4;
						prizeSpeed[3]=4;
						prizeSpeed[4]=5;
					}
			
					for(int i=0;i<=4;i++){
						
						prizeY[i] = prizeY[i] + prizeSpeed[i];
						
						if(prizeY[i] >= Main.setHeight){
							
							prizeY[i] = -100;
						}
					}
					
					
				}
			}
			
		}, 0, 10);
		
		
	}

	public void paint(Graphics g){
		if(Background.imSpiel){
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			
			g.drawImage(resim1, 0, backgroundY1,null);
			g.drawImage(resim2, 0, backgroundY2,null);
			
			g.drawImage(rocket, rocketX, rocketY,null);
	
			for(int i=0;i<=4;i++){
				
				g.drawImage(tas, tasX[i],tasY[i],70,60, null);
	
			}
			
			for(int i=0;i<=4;i++){
	
				//Prize Animation
				
				g.drawImage(myPrize1, prizeX[i], prizeY[i],null);
				
			}
			
			//Flame Animation
			
			if(Background.flameAnimation==0){
				g.drawImage(flame1, rocketX+20, rocketY+40, null);
			}
			else if(Background.flameAnimation==1){
				g.drawImage(flame2, rocketX+20, rocketY+40, null);
			}
			//Patlama Animation
			if(Background.carpma==true){
	
					for(int i=0;i<=15;i++){
						if(explosionAnimation==i){
						System.out.println(explosionAnimation);
						g.drawImage(explosionArray[i], rocketX-10, rocketY-10,73,100,null);
						
					}
				}
					if(explosionAnimation>1&&explosionAnimation<=4){
						g.setColor(new Color(230,0,0,45));
						g.fillRect(0, 0, Main.setWidth, Main.setHeight);
					}
					else if(explosionAnimation>=6&&explosionAnimation<=9){
						g.setColor(new Color(230,0,0,80));
						g.fillRect(0, 0, Main.setWidth, Main.setHeight);
					}
	
				}
			
			//Tas Carpma
			
			if(Background.carpma==true || Background.myHealt>100){
				g.setColor(Color.CYAN);
				g.setFont(new Font("Arial",Font.BOLD,20));
				g.drawString("Healt:" + Background.myHealt, 20, 30);
	
				
			}
			if(Background.myHealt<=0){
				Background.myHealt=0;
				g.setColor(Color.WHITE);
				g.setFont(new Font("Arial",Font.BOLD,30));
				g.drawString("GAME OVER", 200,250);
				
			}
			
			else{
				g.setColor(Color.CYAN);
				g.setFont(new Font("Arial",Font.BOLD,20));
				g.drawString("Healt:" + Background.myHealt, 20,30);
		
			}
		
		}
		
		else if(Background.kayýp){
			
			g.drawImage(resim1, 0, backgroundY1,null);
			g.drawImage(resim2, 0, backgroundY2,null);
			
			//Flame Animation
			
			if(Background.flameAnimation==0){
				g.drawImage(flame1, rocketX+20, rocketY+40, null);
			}
			else if(Background.flameAnimation==1){
				g.drawImage(flame2, rocketX+20, rocketY+40, null);
			}
			
			g.drawImage(rocket, rocketX, rocketY,null);
			
			for(int i=0;i<=4;i++){
				
				g.drawImage(tas, tasX[i],tasY[i],70,60, null);
	
			}
			
			for(int i=0;i<=4;i++){
	
				//Prize Animation
				
				g.drawImage(myPrize1, prizeX[i], prizeY[i],null);
				
			}
			
			g.setColor(new Color(100,100,100,128));
			g.fillRect(0, 0, Main.setWidth, Main.setHeight);
			
			
			
		}
		repaint();
	}

}
