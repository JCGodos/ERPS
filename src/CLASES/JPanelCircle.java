package CLASES;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class JPanelCircle extends JPanel implements MouseListener,ActionListener{
    /* tamaño del JPanel circular */
    private Dimension size = new Dimension( 400,400 );
    //bandera boolean para saber si el cursor del mouse esta dentro o fuera del JPanel
    private boolean __in__ = false;
    private Timer timer;
    //
    private float alto_ancho = 200; //ancho de circulo
    private float posicionxy = 100; //coordenada de la esquina sup derecha del ciruculo
    
    /* array de botones circulares */
    private JButtonCircle[] btn = new JButtonCircle[8];    
    /* coordenadas de los botones circulares */
    private Point[] pB = { new Point(62,170),
                           new Point(278,170) ,
                           
                           new Point(170,64) ,
                           new Point(170,278) ,
            
                           new Point(90,248) ,
                           new Point(90,98) ,
                           
                           new Point(252,98) ,
                           new Point(252,248) 
    };
    
    /* array de ImageIcon -> fotos para los botones */
    private ImageIcon[] icono = {
        new ImageIcon(getClass().getResource("/IMAGENES/foto1.jpg")),
        new ImageIcon(getClass().getResource("/IMAGENES/foto2.jpg")),
        new ImageIcon(getClass().getResource("/IMAGENES/foto3.jpg")),
        new ImageIcon(getClass().getResource("/IMAGENES/foto4.jpg")),
        new ImageIcon(getClass().getResource("/IMAGENES/foto5.jpg")),
        new ImageIcon(getClass().getResource("/IMAGENES/foto6.jpg")),
        new ImageIcon(getClass().getResource("/IMAGENES/foto7.jpg")),
        new ImageIcon(getClass().getResource("/IMAGENES/foto8.jpg"))
    };
    
    /**
     * ActionCommand de los 8 botones circulares
     */
    public enum Accion
    {
        __1,
        __2,
        __3,
        __4,
        __5,
        __6,
        __7,
        __8
    }
    
    /**
     * Constructor de clase
     */
    public JPanelCircle()
    {
        this.setPreferredSize( size );
        this.setSize( size );        
        this.setVisible(true);       
        
        this.addMouseListener(this);
   
        //añade los botones circulares al jpanel circular 
        for( int i=0; i<8 ; i++)
        {
            btn[i] = new JButtonCircle( pB[i] );
            btn[i].setVisible( false );
            btn[i].setActionCommand("__" + (i+1) );
            btn[i].setToolTipText("Boton circular " + (i+1) );
            btn[i].setFotografia( icono[i] );
            btn[i].addActionListener( this ); 
            btn[i].addMouseListener(this);
            this.add( btn[i] );
        }
        
        //JLabel
        JLabel label = new JLabel();
        label.setText("Bloggers");
        label.setForeground( Color.white );
        label.setFont( new Font("Arial", Font.PLAIN,18) );
        label.setOpaque(false);
        label.setBounds(160, 184, 140, 30);        
        label.setVisible(true);
        this.add(label);
                
        //se asigna layout al JPCircle !importante: siempre al final
        this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        //inicia animacion
        animacion();
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {        
        Graphics2D g2 =(Graphics2D) g;         
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //para el fondo blanco se pinta un rectangulo en todo el JPanel circular
        g2.setColor( new Color(0,0,0) );
        Rectangle2D body = new Rectangle2D.Float(0, 0, (float) this.getSize().getWidth(), (float) this.getSize().getHeight() );
        g2.fill( body );
        //circulo google
        google_circle( g2 );        
    }
      
    
    /**
     * pinta el circulo utilizando java2d
     * @param g2 Graphics2D
     */
    private void google_circle( Graphics2D g2 )
    {
        //cuerpo circulo
        g2.setColor( new Color(232,232,232) );                    
        Ellipse2D bcircle = new Ellipse2D.Float( posicionxy , posicionxy , alto_ancho ,alto_ancho );            
        g2.fill( bcircle );
        //pinta borde blanco si es necesario
        if( alto_ancho > 251)
        {            
            g2.setColor( new Color(255,255,255) );
            g2.setStroke(new BasicStroke(15.0f));
            Ellipse2D bcircle1 = new Ellipse2D.Float( posicionxy , posicionxy ,alto_ancho , alto_ancho);
            g2.draw( bcircle1 );
        }
        
        //muestra botones circulares  si es necesario
        if( alto_ancho >= 294 )
        {            
            for( int i=0; i<8 ; i++)
            {            
                btn[i].setVisible(true);            
            }
        }
        else if( alto_ancho < 288 ) //si el circulo es muy pequeño los oculta
        {
            for( int i=0; i<8 ; i++)
            {            
                btn[i].setVisible(false);            
            }
        }
                
        //pinta borde oscuro
        g2.setColor( new Color(155,155,155) );
        g2.setStroke(new BasicStroke( 3.0f) );
        Ellipse2D bcircle2 = new Ellipse2D.Float(posicionxy ,posicionxy ,alto_ancho , alto_ancho );
        g2.draw( bcircle2 );
                    
        //-------------------------------------------------------------------//
        //pinta el circulo interior azul
        g2.setColor( new Color(71,151,207) );
        Ellipse2D circle_int = new Ellipse2D.Float(125.0f ,125.0f ,150.0f ,150.0f);
        g2.fill( circle_int );                
        //borde
        g2.setColor( new Color(61,129,177) );
        g2.setStroke(new BasicStroke(2.0f));
        Ellipse2D bc2 = new Ellipse2D.Float(125.0f ,125.0f ,150.0f ,150.0f);
        g2.draw( bc2 );     
        //-------------------------------------------------------------------//
        
    }
        
   /**
    * Se hace uso de un Timerpara la animacion del google circle
    * cuando el raton esta dentro del JPanel se expande, si esta fuera decrece
    * la velocidad se mide en milisegundo, en este caso se hace uso de 5 milisegundos
    */
   public void animacion() {
    TimerTask task = new TimerTask() {
      @Override
      public void run() {          
          if( __in__ ) //Si raton esta dentro de JPCircle -> crece
          {
            if( alto_ancho <= 300 )
            {
              alto_ancho = alto_ancho + 1;
              posicionxy = posicionxy - 0.5f ;
            }          
          }
          else //Si raton esta fuera de JPCircle -> decrece
          {
            if( alto_ancho > 200 )
            {
                alto_ancho = alto_ancho - 1;
                posicionxy = posicionxy + 0.5f ;
            }                        
          }          
          repaint();
      }
    };
    timer = new Timer();    
    timer.schedule(task, 2, 1 );
  }
    
    
    //-----------------------------------------------------------------------//
    // Eventos del raton
    @Override
    public void mouseClicked(MouseEvent e) { /*...*/ }

    @Override
    public void mousePressed(MouseEvent e) { /*...*/ }

    @Override
    public void mouseReleased(MouseEvent e) { /*...*/ }

    
    @Override
    public void mouseEntered(MouseEvent e) {
        
       __in__ = true;
       // si raton esta dentro del JPCircle
       if( e.getComponent() instanceof JPanelCircle )
       {
         System.out.println ( " dentro el JPanelCircle " );        
       }
       // si esta dentro de algun boton
       else if(e.getComponent() instanceof JPanelCircle )
       {             
            System.out.println ( " dentro un boton " );
            //tamaño fijo del google circle para evitar que este se colapse
            //mientras se esta dentro de un boton
            alto_ancho = 300;
            posicionxy = 50;
       }
       this.repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        __in__ = false;
        if( e.getComponent() instanceof JPanelCircle )
        {           
           System.out.println ( " fuera del JPanelCircle " );
        }
        this.repaint();        
    }

    /**
     * Aqui se deben colocar las acciones que se llevaran a cabo cuando se presione
     * algunos de los botones circulares
     * @param e ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {       
       switch ( Accion.valueOf( e.getActionCommand() ) )
       {
            case __1:
               JOptionPane.showMessageDialog(null,"Se presiono el boton 1" );
               break;
            case __2: 
                JOptionPane.showMessageDialog(null,"Se presiono el boton 2" );
                break;    
            case __3: 
                JOptionPane.showMessageDialog(null,"Se presiono el boton 3" );
                break;    
            case __4: 
                JOptionPane.showMessageDialog(null,"Se presiono el boton 4" );
                break;    
            case __5: 
                JOptionPane.showMessageDialog(null,"Se presiono el boton 5" );
                break;    
            case __6: 
                JOptionPane.showMessageDialog(null,"Se presiono el boton 6" );
                break;    
            case __7: 
                JOptionPane.showMessageDialog(null,"Se presiono el boton 7" );
                break;    
            case __8: 
                JOptionPane.showMessageDialog(null,"Se presiono el boton 8" );
                break;    
    
       }
    }
    
}//--> fin
