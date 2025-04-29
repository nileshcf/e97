package com.cloudframe.app.comput3.dto;

/**
*  The class WcUsGallons is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcUsGallons extends WcUsGallonsSerialized { 
   

								@Getter @Setter private BigDecimal wcUsgBbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUsgKb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUsgLit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUsgM3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUsgUsg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUsgUkg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUsgMmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUsgGbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUsgThm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUsgMwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUsgGj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUsgDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcUsGallons
	**/
    public WcUsGallons() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcUsGallons. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcUsGallons(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcUsgBbl(BigDecimal.valueOf(+23809523800.0000).setScale(4));
								setWcUsgKb(BigDecimal.valueOf(+23809520.0000).setScale(4));
								setWcUsgLit(BigDecimal.valueOf(+3784696200860.0000).setScale(4));
								setWcUsgM3(BigDecimal.valueOf(+3785714391.0000).setScale(4));
								setWcUsgUsg(BigDecimal.valueOf(+1000000000000.0000).setScale(4));
								setWcUsgUkg(BigDecimal.valueOf(+832646399710.0000).setScale(4));
								setWcUsgMmb(BigDecimal.valueOf(+138095238095.2380).setScale(4));
								setWcUsgGbt(BigDecimal.valueOf(+138095238.1000).setScale(4));
								setWcUsgThm(BigDecimal.valueOf(+1380952380952.3800).setScale(4));
								setWcUsgMwh(BigDecimal.valueOf(+40471719214.2589).setScale(4));
								setWcUsgGj(BigDecimal.valueOf(+124928571428.571).setScale(4));
								setWcUsgDay(BigDecimal.valueOf(+23809523800.0000).setScale(4));
    } 



}
  
