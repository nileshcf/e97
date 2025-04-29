package com.cloudframe.app.comput3.dto;

/**
*  The class WcCubicMetres is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcCubicMetres extends WcCubicMetresSerialized { 
   

								@Getter @Setter private BigDecimal wcM3Bbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcM3Kb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcM3Lit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcM3M3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcM3Usg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcM3Ukg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcM3Mmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcM3Gbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcM3Thm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcM3Mwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcM3Gj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcM3Day = BigDecimal.ZERO;
	
	/**
	* Constructor for WcCubicMetres
	**/
    public WcCubicMetres() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcCubicMetres. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcCubicMetres(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcM3Bbl(BigDecimal.valueOf(+629100000.0000).setScale(4));
								setWcM3Kb(BigDecimal.valueOf(+629100.0000).setScale(4));
								setWcM3Lit(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcM3M3(BigDecimal.valueOf(+100000000.0000).setScale(4));
								setWcM3Usg(BigDecimal.valueOf(+26415093600.0000).setScale(4));
								setWcM3Ukg(BigDecimal.valueOf(+21994432080.0000).setScale(4));
								setWcM3Mmb(BigDecimal.valueOf(+3648780000.05300).setScale(4));
								setWcM3Gbt(BigDecimal.valueOf(+3648780.0000).setScale(4));
								setWcM3Thm(BigDecimal.valueOf(+36487800000.0529).setScale(4));
								setWcM3Mwh(BigDecimal.valueOf(+1069351859.4385).setScale(4));
								setWcM3Gj(BigDecimal.valueOf(3300000000L).setScale(4));
								setWcM3Day(BigDecimal.valueOf(+629100000.0000).setScale(4));
    } 



}
  
