package com.cloudframe.app.o529351u.dto;

/**
*  The class LinkAreaM51u is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LinkAreaM51u extends LinkAreaM51uSerialized { 
   
				@Getter @Setter private M51uFlags m51uFlags = new M51uFlags();
				@Getter @Setter private M51uLinkage m51uLinkage = new M51uLinkage();
				@Getter @Setter private UGenericTranslation51 uGenericTranslation51 = new UGenericTranslation51();

						@Getter @Setter private char[] uCcmNOSvcInd51 = Field.fillLowValue(1);

						@Getter @Setter private char[] uSpiTblId51 = Field.fillLowValue(7);

						@Getter @Setter private char[] uHcrProcessSw51 = Field.fillLowValue(1);

						@Getter @Setter private char[] uHcrSpiSw51 = Field.fillLowValue(3);
	
	/**
	* Constructor for LinkAreaM51u
	**/
    public LinkAreaM51u() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for LinkAreaM51u. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LinkAreaM51u(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getM51uFlags().setParent(this,getStartOffset() + 0);
					getM51uLinkage().setParent(this,getStartOffset() + 3);
					getUGenericTranslation51().setParent(this,getStartOffset() + 9348);
    } 



}
  
