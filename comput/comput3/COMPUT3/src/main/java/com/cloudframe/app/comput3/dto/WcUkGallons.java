package com.cloudframe.app.comput3.dto;

/**
*  The class WcUkGallons is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class WcUkGallons extends WcUkGallonsSerialized { 
   

								@Getter @Setter private BigDecimal wcUkgBbl = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUkgKb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUkgLit = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUkgM3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUkgUsg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUkgUkg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUkgMmb = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUkgGbt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUkgThm = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUkgMwh = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUkgGj = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcUkgDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcUkGallons
	**/
    public WcUkGallons() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcUkGallons. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcUkGallons(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcUkgBbl(BigDecimal.valueOf(+28595000000.0000).setScale(4));
								setWcUkgKb(BigDecimal.valueOf(+28595000.0000).setScale(4));
								setWcUkgLit(BigDecimal.valueOf(+4545382292090.0000).setScale(4));
								setWcUkgM3(BigDecimal.valueOf(+4546605231.6040).setScale(4));
								setWcUkgUsg(BigDecimal.valueOf(+1200990000000.0000).setScale(4));
								setWcUkgUkg(BigDecimal.valueOf(+1000000000000.0000).setScale(4));
								setWcUkgMmb(BigDecimal.valueOf(+165851000000.1810).setScale(4));
								setWcUkgGbt(BigDecimal.valueOf(+165851000.0000).setScale(4));
								setWcUkgThm(BigDecimal.valueOf(+1658510000001.8100).setScale(4));
								setWcUkgMwh(BigDecimal.valueOf(+48606130059.1859).setScale(4));
								setWcUkgGj(BigDecimal.valueOf(125070089000L).setScale(4));
								setWcUkgDay(BigDecimal.valueOf(+28595000000.0000).setScale(4));
    } 



}
  
