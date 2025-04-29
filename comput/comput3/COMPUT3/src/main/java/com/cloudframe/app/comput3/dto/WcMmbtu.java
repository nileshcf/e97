package com.cloudframe.app.comput3.dto;

/**
*  The class WcMmbtu is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcMmbtu extends WcMmbtuSerialized { 
   

								@Getter @Setter private BigDecimal wcMmbBbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMmbKb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMmbLit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMmbM3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMmbUsg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMmbUkg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMmbMmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMmbGbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMmbThm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMmbMwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMmbGj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMmbDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcMmbtu
	**/
    public WcMmbtu() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcMmbtu. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcMmbtu(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcMmbBbl(BigDecimal.valueOf(+1724137931.0345).setScale(4));
								setWcMmbKb(BigDecimal.valueOf(+1724137.9310).setScale(4));
								setWcMmbLit(BigDecimal.valueOf(+274064207758.6210).setScale(4));
								setWcMmbM3(BigDecimal.valueOf(+274064207.7586).setScale(4));
								setWcMmbUsg(BigDecimal.valueOf(+72413793103.4483).setScale(4));
								setWcMmbUkg(BigDecimal.valueOf(+60295084141.7241).setScale(4));
								setWcMmbMmb(BigDecimal.valueOf(+10000000000.0000).setScale(4));
								setWcMmbGbt(BigDecimal.valueOf(+10000000.0000).setScale(4));
								setWcMmbThm(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcMmbMwh(BigDecimal.valueOf(+2930710701.7222).setScale(4));
								setWcMmbGj(BigDecimal.valueOf(+10550558526.1999).setScale(4));
								setWcMmbDay(BigDecimal.valueOf(+1724137931.0345).setScale(4));
    } 



}
  
