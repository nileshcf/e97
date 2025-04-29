package com.cloudframe.app.comput3.dto;

/**
*  The class WcGbt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcGbt extends WcGbtSerialized { 
   

								@Getter @Setter private BigDecimal wcGbtBbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGbtKb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGbtLit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGbtM3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGbtUsg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGbtUkg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGbtMmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGbtGbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGbtThm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGbtMwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGbtGj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcGbtDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcGbt
	**/
    public WcGbt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcGbt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcGbt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcGbtBbl(BigDecimal.valueOf(+17241379310.3448).setScale(4));
								setWcGbtKb(BigDecimal.valueOf(+17241379.3103).setScale(4));
								setWcGbtLit(BigDecimal.valueOf(+40642077586.2100).setScale(4));
								setWcGbtM3(BigDecimal.valueOf(+2741379386.2069).setScale(4));
								setWcGbtUsg(BigDecimal.valueOf(+724137931034.4830).setScale(4));
								setWcGbtUkg(BigDecimal.valueOf(+602950841417.2410).setScale(4));
								setWcGbtMmb(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcGbtGbt(BigDecimal.valueOf(+100000000.0000).setScale(4));
								setWcGbtThm(BigDecimal.valueOf(+1000000000000.0000).setScale(4));
								setWcGbtMwh(BigDecimal.valueOf(+29307107017.2222).setScale(4));
								setWcGbtGj(BigDecimal.valueOf(+1055055852.6199).setScale(4));
								setWcGbtDay(BigDecimal.valueOf(+17241379310.3448).setScale(4));
    } 



}
  
