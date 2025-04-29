package com.cloudframe.app.comput3.dto;

/**
*  The class WcThm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcThm extends WcThmSerialized { 
   

								@Getter @Setter private BigDecimal wcThmBbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcThmKb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcThmLit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcThmM3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcThmUsg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcThmUkg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcThmMmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcThmGbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcThmThm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcThmMwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcThmGj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcThmDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcThm
	**/
    public WcThm() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcThm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcThm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcThmBbl(BigDecimal.valueOf(+17241379310.3448).setScale(4));
								setWcThmKb(BigDecimal.valueOf(+17241379.3104).setScale(4));
								setWcThmLit(BigDecimal.valueOf(+2740642077586.2100).setScale(4));
								setWcThmM3(BigDecimal.valueOf(+2740642077.5862).setScale(4));
								setWcThmUsg(BigDecimal.valueOf(+724137931034.4830).setScale(4));
								setWcThmUkg(BigDecimal.valueOf(+602950841417.2410).setScale(4));
								setWcThmMmb(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcThmGbt(BigDecimal.valueOf(+100000000.0000).setScale(4));
								setWcThmThm(BigDecimal.valueOf(+1000000000000.0000).setScale(4));
								setWcThmMwh(BigDecimal.valueOf(+29307107017.2222).setScale(4));
								setWcThmGj(BigDecimal.valueOf(+105505585261.9999).setScale(4));
								setWcThmDay(BigDecimal.valueOf(+17241379310.3448).setScale(4));
    } 



}
  
