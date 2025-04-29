package com.cloudframe.app.comput3.dto;

/**
*  The class WcBarrels is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcBarrels extends WcBarrelsSerialized { 
   

								@Getter @Setter private BigDecimal wcBblBbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcBblKb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcBblLit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcBblM3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcBblUsg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcBblUkg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcBblMmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcBblGbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcBblThm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcBblMwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcBblGj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcBblDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcBarrels
	**/
    public WcBarrels() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcBarrels. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcBarrels(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcBblBbl(BigDecimal.valueOf(+1000000.0000).setScale(4));
								setWcBblKb(BigDecimal.valueOf(+1000.0000).setScale(4));
								setWcBblLit(BigDecimal.valueOf(+158957240.5000).setScale(4));
								setWcBblM3(BigDecimal.valueOf(+158957.2405).setScale(4));
								setWcBblUsg(BigDecimal.valueOf(+42000000.0000).setScale(4));
								setWcBblUkg(BigDecimal.valueOf(+34971148.8022).setScale(4));
								setWcBblMmb(BigDecimal.valueOf(+5800000.0000).setScale(4));
								setWcBblGbt(BigDecimal.valueOf(+5800.0000).setScale(4));
								setWcBblThm(BigDecimal.valueOf(+58000000.0000).setScale(4));
								setWcBblMwh(BigDecimal.valueOf(+1699812.2070).setScale(4));
								setWcBblGj(BigDecimal.valueOf(+5246601.7284).setScale(4));
								setWcBblDay(BigDecimal.valueOf(+1000000.0000).setScale(4));
    } 



}
  
