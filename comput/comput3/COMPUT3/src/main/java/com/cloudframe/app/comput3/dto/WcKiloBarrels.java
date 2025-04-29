package com.cloudframe.app.comput3.dto;

/**
*  The class WcKiloBarrels is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcKiloBarrels extends WcKiloBarrelsSerialized { 
   

								@Getter @Setter private BigDecimal wcKbBbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcKbKb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcKbLit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcKbM3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcKbUsg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcKbUkg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcKbMmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcKbGbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcKbThm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcKbMwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcKbGj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcKbDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcKiloBarrels
	**/
    public WcKiloBarrels() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcKiloBarrels. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcKiloBarrels(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcKbBbl(BigDecimal.valueOf(+10000000.0000).setScale(4));
								setWcKbKb(BigDecimal.valueOf(+10000.0000).setScale(4));
								setWcKbLit(BigDecimal.valueOf(+1589572405.0000).setScale(4));
								setWcKbM3(BigDecimal.valueOf(+1589572.4050).setScale(4));
								setWcKbUsg(BigDecimal.valueOf(+420000000.0000).setScale(4));
								setWcKbUkg(BigDecimal.valueOf(+349711488.0220).setScale(4));
								setWcKbMmb(BigDecimal.valueOf(+58000000.0000).setScale(4));
								setWcKbGbt(BigDecimal.valueOf(+58000.0000).setScale(4));
								setWcKbThm(BigDecimal.valueOf(+580000000.0000).setScale(4));
								setWcKbMwh(BigDecimal.valueOf(+1699812.2070).setScale(4));
								setWcKbGj(BigDecimal.valueOf(+52466017.2836).setScale(4));
								setWcKbDay(BigDecimal.valueOf(+10000000.0000).setScale(4));
    } 



}
  
