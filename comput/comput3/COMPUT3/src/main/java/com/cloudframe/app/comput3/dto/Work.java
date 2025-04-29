package com.cloudframe.app.comput3.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private BigDecimal wvTempVolume;

								@Getter @Setter private BigDecimal wvWorkingQty;

								@Getter @Setter private long wvSourceScale;

								@Getter @Setter private BigDecimal wvUnsignedVolume = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal dexr001SourceQty = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal dexr001TargetQty = BigDecimal.ZERO;

								@Getter @Setter private short wvSourceSub;

								@Getter @Setter private short wvTargetSub;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWvUnsignedVolume(BigDecimal.ZERO);
								setWvSourceSub((short)0);
								setWvTargetSub((short)0);
    }





}
  
