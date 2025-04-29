package com.cloudframe.app.comput3.dto;

/**
*  The class WcMwh is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcMwh extends WcMwhSerialized { 
   

								@Getter @Setter private BigDecimal wcMwhBbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMwhKb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMwhLit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMwhM3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMwhUsg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMwhUkg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMwhMmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMwhGbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMwhThm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMwhMwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMwhGj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcMwhDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcMwh
	**/
    public WcMwh() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcMwh. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcMwh(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcMwhBbl(BigDecimal.valueOf(+58830028157.2406).setScale(4));
								setWcMwhKb(BigDecimal.valueOf(+588300281.5724).setScale(4));
								setWcMwhLit(BigDecimal.valueOf(+9351458934434.1610).setScale(4));
								setWcMwhM3(BigDecimal.valueOf(+9351458934.4342).setScale(4));
								setWcMwhUsg(BigDecimal.valueOf(+2470861182609.8884).setScale(4));
								setWcMwhUkg(BigDecimal.valueOf(+2057353668729.2903).setScale(4));
								setWcMwhMmb(BigDecimal.valueOf(+341214163312.7940).setScale(4));
								setWcMwhGbt(BigDecimal.valueOf(+341214163.3128).setScale(4));
								setWcMwhThm(BigDecimal.valueOf(+3412141633127.9400).setScale(4));
								setWcMwhMwh(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcMwhGj(BigDecimal.valueOf(+360000000000.0000).setScale(4));
								setWcMwhDay(BigDecimal.valueOf(+58830028157.2406).setScale(4));
    } 



}
  
