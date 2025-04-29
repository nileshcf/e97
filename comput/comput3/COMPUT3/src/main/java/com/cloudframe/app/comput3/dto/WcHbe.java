package com.cloudframe.app.comput3.dto;

/**
*  The class WcHbe is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcHbe extends WcHbeSerialized { 
   

								@Getter @Setter private BigDecimal wcGjBbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGjKb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGjLit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGjM3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGjUsg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGjUkg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGjMmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGjGbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGjThm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGjMwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGjGj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGjDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcHbe
	**/
    public WcHbe() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcHbe. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcHbe(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcGjBbl(BigDecimal.valueOf(+19059956363.6364).setScale(4));
								setWcGjKb(BigDecimal.valueOf(+19035995.6364).setScale(4));
								setWcGjLit(BigDecimal.valueOf(+3030303030303.03).setScale(4));
								setWcGjM3(BigDecimal.valueOf(+3030303030.3030).setScale(4));
								setWcGjUsg(BigDecimal.valueOf(+799552250739.5850).setScale(4));
								setWcGjUkg(BigDecimal.valueOf(+665787159190.8524).setScale(4));
								setWcGjMmb(BigDecimal.valueOf(+94781712031.3317).setScale(4));
								setWcGjGbt(BigDecimal.valueOf(+94781712.0313).setScale(4));
								setWcGjThm(BigDecimal.valueOf(+947817120313.3167).setScale(4));
								setWcGjMwh(BigDecimal.valueOf(+27777777777.7778).setScale(4));
								setWcGjGj(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcGjDay(BigDecimal.valueOf(+19059956363.6364).setScale(4));
    } 



}
  
