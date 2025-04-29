package com.cloudframe.app.comput3.dto;

/**
*  The class WcDay is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcDay extends WcDaySerialized { 
   

								@Getter @Setter private BigDecimal wcDayBbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcDayKb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcDayLit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcDayM3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcDayUsg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcDayUkg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcDayMmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcDayGbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcDayThm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcDayMwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcDayGj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcDayDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcDay
	**/
    public WcDay() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcDay. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcDay(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcDayBbl(BigDecimal.valueOf(+1000000.0000).setScale(4));
								setWcDayKb(BigDecimal.valueOf(+1000.0000).setScale(4));
								setWcDayLit(BigDecimal.valueOf(+158957240.5000).setScale(4));
								setWcDayM3(BigDecimal.valueOf(+158957.2405).setScale(4));
								setWcDayUsg(BigDecimal.valueOf(+42000000.0000).setScale(4));
								setWcDayUkg(BigDecimal.valueOf(+34971148.8022).setScale(4));
								setWcDayMmb(BigDecimal.valueOf(+5800000.0000).setScale(4));
								setWcDayGbt(BigDecimal.valueOf(+5800.0000).setScale(4));
								setWcDayThm(BigDecimal.valueOf(+58000000.0000).setScale(4));
								setWcDayMwh(BigDecimal.valueOf(+1699812.2070).setScale(4));
								setWcDayGj(BigDecimal.valueOf(+5252943.7265).setScale(4));
								setWcDayDay(BigDecimal.valueOf(+1000000.0000).setScale(4));
    } 



}
  
