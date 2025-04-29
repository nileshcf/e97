package com.cloudframe.app.comput2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private long div;

								@Getter @Setter private BigDecimal allow = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal oosuSharedAllow = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu3aTotDataPromoAllow = BigDecimal.ZERO;

								@Getter @Setter private int cKilobyteNum;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCKilobyteNum(1024);
    }





}
  
