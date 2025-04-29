package com.cloudframe.app.ms00d363.file.records;

/**
*  The class CertificationRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CertificationRec extends CertificationRecSerialized {
   

						@Getter @Setter private char[] crParameterId = Field.fillLowValue(8);

						@Getter @Setter private char[] crDomesticOnSoil = Field.fillLowValue(5);

						@Getter @Setter private char[] localEnv = Field.fillLowValue(14);
	
	/**
	* Constructor for CertificationRec
	**/
    public CertificationRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
