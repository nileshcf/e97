package com.cloudframe.app.comput3.dto;

/**
*  The class WcLitres is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcLitres extends WcLitresSerialized { 
   

								@Getter @Setter private BigDecimal wcLitBbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcLitKb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcLitLit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcLitM3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcLitUsg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcLitUkg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcLitMmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcLitGbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcLitThm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcLitMwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcLitGj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcLitDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcLitres
	**/
    public WcLitres() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcLitres. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcLitres(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcLitBbl(BigDecimal.valueOf(+629100000.0000).setScale(4));
								setWcLitKb(BigDecimal.valueOf(+629100.0000).setScale(4));
								setWcLitLit(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcLitM3(BigDecimal.valueOf(+100000000.0000).setScale(4));
								setWcLitUsg(BigDecimal.valueOf(+26422200000.0000).setScale(4));
								setWcLitUkg(BigDecimal.valueOf(22000349711L).setScale(4));
								setWcLitMmb(BigDecimal.valueOf(+3648780000.0529).setScale(4));
								setWcLitGbt(BigDecimal.valueOf(+3648780.0000).setScale(4));
								setWcLitThm(BigDecimal.valueOf(+36487800000.5291).setScale(4));
								setWcLitMwh(BigDecimal.valueOf(+1069351859.4385).setScale(4));
								setWcLitGj(BigDecimal.valueOf(3300000000L).setScale(4));
								setWcLitDay(BigDecimal.valueOf(+629100000.0000).setScale(4));
    } 



}
  
