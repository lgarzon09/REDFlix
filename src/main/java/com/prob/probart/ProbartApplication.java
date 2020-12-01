package com.prob.probart;

import com.prob.probart.view.ventana;
import java.awt.Dimension;
import java.awt.Toolkit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.prob.probart")
public class ProbartApplication {

	public static void main(String[] args) {
            ventana ventana = new ventana();
        
            ventana.setSize(500, 650);
       
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = ventana.getSize();
            ventana.setLocation((screenSize.width - frameSize.width) / 2, 
                (screenSize.height - frameSize.height) / 2);
        
            ventana.setVisible(true);
	}
        
        public static void runSpringServer(String[] args) {
            SpringApplication.run(ProbartApplication.class, args);
        }
}
