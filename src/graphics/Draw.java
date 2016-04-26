package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//panix.com/~jrr

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Draw extends JFrame
{
	
	public Draw()
	{
		super("Drawing Demo");
		setSize(800,800);
		setLocation(400,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new Inner());
		setVisible(true);
		
	}
	
	private class Inner extends JPanel
	{
		private Timer _timer;
		private int   _delay;
		private int   _x;
		private int   _y;
		private int   _r;
		private int   _rad;
		private int   _up;
		private int   _bounce;
		private int   _c;
		private double   _ang;
		
		
		public Inner()
		{
			_delay = 70;
			_r = 50;
			_rad = 300;
			_bounce = 100;
			_timer = new Timer(_delay, new TimerFire());
			_timer.start();

		}
		
		private class TimerFire implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rotate();
			}
			
		}
		
		public void rotate()
		{
			Dimension d = getSize();
			_x = (int) (d.width/2 + _rad * Math.cos(_ang * Math.PI / 180F));
			_y = (int) (d.height/2 + _rad * Math.sin(_ang * Math.PI / 180F));
			if(_ang == 360)
			{
				_ang = 0;
			}
			_ang += 1;
			
			repaint();
		}
		
		public void bounce()
		{
			_up = _up * -1;
			_y += _bounce * _up;
			repaint();
		}
		
		public void init()
		{
			Dimension d = getSize();
			_x = d.width/2;
			_y = d.height/2;
			_up = 1;
		}
		
		public void paint(Graphics g)
		{
			super.paint(g);
			drawBall(g, _x, _y, _r);
			drawCross(g);
		}
		
		public void drawBounce(Graphics g)
		{
			if(_c == 0)
			{
				++_c;
				init();
			}
			g.setColor(Color.blue);
			g.fillOval(_x, _y, _r, _r);
		}
		
		public void drawBall(Graphics g, int x, int y, int r)
		{
			g.setColor(Color.blue);
			g.fillOval(x-r/2, y-r/2, r, r);
			//int bounce = 100;
			//g.fillOval(x, y-bounce, r, r);
		}
		
		public void drawCross(Graphics g)
		{
			g.setColor(Color.green);
			Dimension d = getSize();
			int x1 = d.width/2;
			int y1 = 0;
			int x2 = x1;
			int y2 = d.height;
			g.drawLine(x1,y1,x2,y2);
			x1 = 0;
			y1 = d.height/2;
			x2 = d.width;
			y2 = y1;
			g.drawLine(x1, y1, x2, y2);
		}
		
		
	}
	
	public static void main(String [] args)
	{
		new Draw();
	}

}
