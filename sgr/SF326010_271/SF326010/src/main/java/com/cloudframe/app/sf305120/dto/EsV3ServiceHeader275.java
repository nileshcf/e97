package com.cloudframe.app.sf305120.dto;

/**
*  The class EsV3ServiceHeader275 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class EsV3ServiceHeader275 extends EsV3ServiceHeader275Serialized {
   

						@Getter @Setter private char[] esV3SrvId275 = new char[4];

						@Getter @Setter private char[] esV3SrvreqId275 = new char[6];

						@Getter @Setter private char[] esV3SrvVersion275 = new char[1];

						@Getter @Setter private char[] esV3SiHdrLnth275 = new char[1];

						@Getter @Setter private char[] esV3SrvStatus275 = new char[1];

						@Getter @Setter private char[] esV3StatusRc275 = new char[1];

								@Getter @Setter private short esV3SrvDataLnth275;

						@Getter @Setter private char[] esV3PayloadSpec275 = new char[1];

								@Getter @Setter private short esV3PayloadLnth275;

						@Getter @Setter private char[] esV3PayloadData275 = new char[1000];
	
	/**
	* Constructor for EsV3ServiceHeader275
	**/
    public EsV3ServiceHeader275() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setEsV3SrvId275(fillSpace(4));
								setEsV3SrvreqId275(fillSpace(6));
								setEsV3SrvVersion275(fillLowValue(1));
								setEsV3SiHdrLnth275(fillLowValue(1));
								setEsV3SrvStatus275(fillSpace(1));
								setEsV3StatusRc275(fillLowValue(1));
								setEsV3SrvDataLnth275((short)0);
								setEsV3PayloadSpec275(fillLowValue(1));
								setEsV3PayloadLnth275((short)0);
								setEsV3PayloadData275(fillLowValue(1000));
    }





}
  
