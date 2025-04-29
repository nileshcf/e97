package com.cloudframe.app.sf305120.dto;

/**
*  The class EsVersion1270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class EsVersion1270 extends EsVersion1270Serialized { 
   

						@Getter @Setter private char[] esHeaderId270 = new char[2];

						@Getter @Setter private char[] esVersion270 = new char[1];

						@Getter @Setter private char[] esV1HdrLength270 = new char[1];

								@Getter @Setter private int esV1SrvreqLnth270;
				@Getter @Setter private EsV1CorrelId270 esV1CorrelId270 = new EsV1CorrelId270();

						@Getter @Setter private char[] esV1SrvVersion270 = new char[1];

						@Getter @Setter private char[] esV1SiHdrLnth270 = new char[1];

						@Getter @Setter private char[] esV1SrvStatus270 = new char[1];

						@Getter @Setter private char[] esV1StatusRc270 = new char[1];

								@Getter @Setter private short esV1SrvDataLnth270;

						@Getter @Setter private char[] esV1SrvData270 = new char[8000];
	
	/**
	* Constructor for EsVersion1270
	**/
    public EsVersion1270() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for EsVersion1270. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsVersion1270(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getEsV1CorrelId270().setParent(this,getStartOffset() + 8);
								setEsHeaderId270(("ES").toCharArray());
								setEsVersion270(fillLowValue(1));
								setEsV1HdrLength270(fillLowValue(1));
								setEsV1SrvreqLnth270(0);
								setEsV1SrvVersion270(fillLowValue(1));
								setEsV1SiHdrLnth270(fillLowValue(1));
								setEsV1SrvStatus270(fillSpace(1));
								setEsV1StatusRc270(fillLowValue(1));
								setEsV1SrvDataLnth270((short)0);
								setEsV1SrvData270(pad(8000," ".toCharArray(),' ',RIGHT_PAD));
    } 



}
  
