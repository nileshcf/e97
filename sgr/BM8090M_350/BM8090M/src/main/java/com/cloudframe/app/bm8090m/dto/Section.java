package com.cloudframe.app.bm8090m.dto;

/**
*  The class Section is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Section extends SectionSerialized {
   

								private int wIndxTitular;

								private int wTotTit;

						private char[] wPriTitu = Field.fillLowValue(60);

								private int wLonPriTitu;

						private char[] wSegTitu = Field.fillLowValue(60);

								private int wLonSegTitu;

						private char[] wTitCtaPe8090m = new char[100];

						private char[] wPriTroPe8090m = new char[50];

						private char[] wSegTroPe8090m = new char[50];

						private char[] wTitCtaAux = new char[100];

						private char[] wPriTroAux = new char[50];

						private char[] wSegTroAux = new char[50];
				private WTpePe8090m wTpePe8090m = new WTpePe8090m();
				private WTobPe8090m wTobPe8090m = new WTobPe8090m();
				private WDatVarPe8090m wDatVarPe8090m = new WDatVarPe8090m();
				private WZonAlmPe8090m wZonAlmPe8090m = new WZonAlmPe8090m();
				private WIniNomaPe8090m wIniNomaPe8090m = new WIniNomaPe8090m();
				private WIniNomrPe8090m wIniNomrPe8090m = new WIniNomrPe8090m();
				private WZonFpfPe8090m wZonFpfPe8090m = new WZonFpfPe8090m();
				private WAstPapPe8090m wAstPapPe8090m = new WAstPapPe8090m();
				private WAstJurPe8090m wAstJurPe8090m = new WAstJurPe8090m();

								private int wImpPe8090m;

						private char[] wTitulPe8090m = Field.fillLowValue(140);
				private WIniNomPe8090m wIniNomPe8090m = new WIniNomPe8090m();

								private int wNumPerFisPe8090m;
				private WMcas3Pe8090m wMcas3Pe8090m = new WMcas3Pe8090m();
				private WMcas3aPe8090m wMcas3aPe8090m = new WMcas3aPe8090m();
				private WMcas3bPe8090m wMcas3bPe8090m = new WMcas3bPe8090m();
				private WMcat3Pe8090m wMcat3Pe8090m = new WMcat3Pe8090m();
				private WMcat3aPe8090m wMcat3aPe8090m = new WMcat3aPe8090m();
				private WMcat3bPe8090m wMcat3bPe8090m = new WMcat3bPe8090m();
				private WMcas6Pe8090m wMcas6Pe8090m = new WMcas6Pe8090m();
				private WMcas6aPe8090m wMcas6aPe8090m = new WMcas6aPe8090m();
				private WMcas6bPe8090m wMcas6bPe8090m = new WMcas6bPe8090m();
				private WMcat6Pe8090m wMcat6Pe8090m = new WMcat6Pe8090m();
				private WMcat6aPe8090m wMcat6aPe8090m = new WMcat6aPe8090m();
				private WMcat6bPe8090m wMcat6bPe8090m = new WMcat6bPe8090m();
				private WMcas7Pe8090m wMcas7Pe8090m = new WMcas7Pe8090m();
				private WMcas7aPe8090m wMcas7aPe8090m = new WMcas7aPe8090m();
				private WMcas7bPe8090m wMcas7bPe8090m = new WMcas7bPe8090m();
				private WMcat7Pe8090m wMcat7Pe8090m = new WMcat7Pe8090m();
				private WMcat7aPe8090m wMcat7aPe8090m = new WMcat7aPe8090m();
				private WMcat7bPe8090m wMcat7bPe8090m = new WMcat7bPe8090m();
	
	/**
	* Constructor for Section
	**/
    public Section() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wTpePe8090m.setParent(this,getStartOffset() + 528);
	       			wTobPe8090m.setParent(this,getStartOffset() + 2352);
	       			wDatVarPe8090m.setParent(this,getStartOffset() + 2384);
	       			wZonAlmPe8090m.setParent(this,getStartOffset() + 2408);
	       			wIniNomaPe8090m.setParent(this,getStartOffset() + 2604);
	       			wIniNomrPe8090m.setParent(this,getStartOffset() + 2604);
	       			wZonFpfPe8090m.setParent(this,getStartOffset() + 2664);
	       			wAstPapPe8090m.setParent(this,getStartOffset() + 2690);
	       			wAstJurPe8090m.setParent(this,getStartOffset() + 2710);
	       			wIniNomPe8090m.setParent(this,getStartOffset() + 2912);
	       			wMcas3Pe8090m.setParent(this,getStartOffset() + 2934);
	       			wMcas3aPe8090m.setParent(this,getStartOffset() + 2943);
	       			wMcas3bPe8090m.setParent(this,getStartOffset() + 2953);
	       			wMcat3Pe8090m.setParent(this,getStartOffset() + 2964);
	       			wMcat3aPe8090m.setParent(this,getStartOffset() + 2973);
	       			wMcat3bPe8090m.setParent(this,getStartOffset() + 2983);
	       			wMcas6Pe8090m.setParent(this,getStartOffset() + 2994);
	       			wMcas6aPe8090m.setParent(this,getStartOffset() + 3009);
	       			wMcas6bPe8090m.setParent(this,getStartOffset() + 3025);
	       			wMcat6Pe8090m.setParent(this,getStartOffset() + 3042);
	       			wMcat6aPe8090m.setParent(this,getStartOffset() + 3057);
	       			wMcat6bPe8090m.setParent(this,getStartOffset() + 3073);
	       			wMcas7Pe8090m.setParent(this,getStartOffset() + 3090);
	       			wMcas7aPe8090m.setParent(this,getStartOffset() + 3102);
	       			wMcas7bPe8090m.setParent(this,getStartOffset() + 3115);
	       			wMcat7Pe8090m.setParent(this,getStartOffset() + 3129);
	       			wMcat7aPe8090m.setParent(this,getStartOffset() + 3141);
	       			wMcat7bPe8090m.setParent(this,getStartOffset() + 3154);
	   	/*  end of offset */
								setWTitCtaPe8090m(pad(100," ".toCharArray(),' ',RIGHT_PAD));
								setWPriTroPe8090m(fillSpace(50));
								setWSegTroPe8090m(fillSpace(50));
								setWTitCtaAux(pad(100," ".toCharArray(),' ',RIGHT_PAD));
								setWPriTroAux(fillSpace(50));
								setWSegTroAux(fillSpace(50));
								setWImpPe8090m(0);
    }


 

	/**
	 *	Returns the value of wIndxTitular
	 *	@return wIndxTitular
	 */
	public int getWIndxTitular() throws CFException {
        if (isWIndxTitularModified()) { 
           wIndxTitular = refreshWIndxTitular();
        }
   		return wIndxTitular;
	}
	
	/**
	 * 	Update WIndxTitular with the passed value
	 *  Corresponding COBOL Variable is W-INDX-TITULAR
	 *	@param number
	 */
	public void setWIndxTitular(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wIndxTitular = checkWIndxTitularMaxLimit(number); 
		serializeWIndxTitular(wIndxTitular);
	}


	public void setWIndxTitular(long number) {
	    number = checkWIndxTitularMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWIndxTitular((int)number);
	}
	
	/**
	 *	Returns the value of wTotTit
	 *	@return wTotTit
	 */
	public int getWTotTit() throws CFException {
        if (isWTotTitModified()) { 
           wTotTit = refreshWTotTit();
        }
   		return wTotTit;
	}
	
	/**
	 * 	Update WTotTit with the passed value
	 *  Corresponding COBOL Variable is W-TOT-TIT
	 *	@param number
	 */
	public void setWTotTit(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wTotTit = checkWTotTitMaxLimit(number); 
		serializeWTotTit(wTotTit);
	}


	public void setWTotTit(long number) {
	    number = checkWTotTitMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWTotTit((int)number);
	}
	
	/**
	 *	Returns the value of wPriTitu
	 *	@return wPriTitu
	 */
   public char[] getWPriTitu() throws CFException{
     if (isWPriTituModified()) { 
        wPriTitu = refreshWPriTitu();
     }
   		return wPriTitu;
   }

  
	/**
	*  set variable wPriTitu
	*  Corresponding COBOL Variable is W-PRI-TITU
	*  @param value
	**/
   public void setWPriTitu(char[] value) {
      wPriTitu = checkWPriTituConstraints(value);
      serializeWPriTitu(wPriTitu);
   } 

     /**
	 * 	Update WPriTitu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTitu(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWPriTitu,wPriTitu.length);
   	
   }
   
   public void setWPriTitu(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWPriTitu,wPriTitu.length);
   	
   }
   
     /**
	 * 	Update WPriTitu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTitu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPriTitu+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WPriTitu with another Field
	 *	@param value
	 */
   public void setWPriTitu(Field source) {
       replace(source,0,source.length(),beginWPriTitu,W_PRI_TITU_LEN);
   	
   }  
   
     /**
	 * 	Update WPriTitu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTitu(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWPriTitu,W_PRI_TITU_LEN);
   	
   }
   
     /**
	 * 	Update WPriTitu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTitu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPriTitu+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wLonPriTitu
	 *	@return wLonPriTitu
	 */
	public int getWLonPriTitu() throws CFException {
        if (isWLonPriTituModified()) { 
           wLonPriTitu = refreshWLonPriTitu();
        }
   		return wLonPriTitu;
	}
	
	/**
	 * 	Update WLonPriTitu with the passed value
	 *  Corresponding COBOL Variable is W-LON-PRI-TITU
	 *	@param number
	 */
	public void setWLonPriTitu(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wLonPriTitu = checkWLonPriTituMaxLimit(number); 
		serializeWLonPriTitu(wLonPriTitu);
	}


	public void setWLonPriTitu(long number) {
	    number = checkWLonPriTituMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWLonPriTitu((int)number);
	}
	
	/**
	 *	Returns the value of wSegTitu
	 *	@return wSegTitu
	 */
   public char[] getWSegTitu() throws CFException{
     if (isWSegTituModified()) { 
        wSegTitu = refreshWSegTitu();
     }
   		return wSegTitu;
   }

  
	/**
	*  set variable wSegTitu
	*  Corresponding COBOL Variable is W-SEG-TITU
	*  @param value
	**/
   public void setWSegTitu(char[] value) {
      wSegTitu = checkWSegTituConstraints(value);
      serializeWSegTitu(wSegTitu);
   } 

     /**
	 * 	Update WSegTitu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTitu(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWSegTitu,wSegTitu.length);
   	
   }
   
   public void setWSegTitu(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWSegTitu,wSegTitu.length);
   	
   }
   
     /**
	 * 	Update WSegTitu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTitu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWSegTitu+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WSegTitu with another Field
	 *	@param value
	 */
   public void setWSegTitu(Field source) {
       replace(source,0,source.length(),beginWSegTitu,W_SEG_TITU_LEN);
   	
   }  
   
     /**
	 * 	Update WSegTitu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTitu(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWSegTitu,W_SEG_TITU_LEN);
   	
   }
   
     /**
	 * 	Update WSegTitu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTitu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWSegTitu+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wLonSegTitu
	 *	@return wLonSegTitu
	 */
	public int getWLonSegTitu() throws CFException {
        if (isWLonSegTituModified()) { 
           wLonSegTitu = refreshWLonSegTitu();
        }
   		return wLonSegTitu;
	}
	
	/**
	 * 	Update WLonSegTitu with the passed value
	 *  Corresponding COBOL Variable is W-LON-SEG-TITU
	 *	@param number
	 */
	public void setWLonSegTitu(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wLonSegTitu = checkWLonSegTituMaxLimit(number); 
		serializeWLonSegTitu(wLonSegTitu);
	}


	public void setWLonSegTitu(long number) {
	    number = checkWLonSegTituMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWLonSegTitu((int)number);
	}
	
	/**
	 *	Returns the value of wTitCtaPe8090m
	 *	@return wTitCtaPe8090m
	 */
   public char[] getWTitCtaPe8090m() throws CFException{
     if (isWTitCtaPe8090mModified()) { 
        wTitCtaPe8090m = refreshWTitCtaPe8090m();
     }
   		return wTitCtaPe8090m;
   }

  
	/**
	*  set variable wTitCtaPe8090m
	*  Corresponding COBOL Variable is W-TIT-CTA-PE8090M
	*  @param value
	**/
   public void setWTitCtaPe8090m(char[] value) {
      wTitCtaPe8090m = checkWTitCtaPe8090mConstraints(value);
      serializeWTitCtaPe8090m(wTitCtaPe8090m);
   } 

     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWTitCtaPe8090m,wTitCtaPe8090m.length);
   	
   }
   
   public void setWTitCtaPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWTitCtaPe8090m,wTitCtaPe8090m.length);
   	
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWTitCtaPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WTitCtaPe8090m with another Field
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source) {
       replace(source,0,source.length(),beginWTitCtaPe8090m,W_TIT_CTA_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWTitCtaPe8090m,W_TIT_CTA_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WTitCtaPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWTitCtaPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wPriTroPe8090m
	 *	@return wPriTroPe8090m
	 */
   public char[] getWPriTroPe8090m() throws CFException{
     if (isWPriTroPe8090mModified()) { 
        wPriTroPe8090m = refreshWPriTroPe8090m();
     }
   		return wPriTroPe8090m;
   }

  
	/**
	*  set variable wPriTroPe8090m
	*  Corresponding COBOL Variable is W-PRI-TRO-PE8090M
	*  @param value
	**/
   public void setWPriTroPe8090m(char[] value) {
      wPriTroPe8090m = checkWPriTroPe8090mConstraints(value);
      serializeWPriTroPe8090m(wPriTroPe8090m);
   } 

     /**
	 * 	Update WPriTroPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTroPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWPriTroPe8090m,wPriTroPe8090m.length);
   	
   }
   
   public void setWPriTroPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWPriTroPe8090m,wPriTroPe8090m.length);
   	
   }
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPriTroPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WPriTroPe8090m with another Field
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source) {
       replace(source,0,source.length(),beginWPriTroPe8090m,W_PRI_TRO_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWPriTroPe8090m,W_PRI_TRO_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WPriTroPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPriTroPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wSegTroPe8090m
	 *	@return wSegTroPe8090m
	 */
   public char[] getWSegTroPe8090m() throws CFException{
     if (isWSegTroPe8090mModified()) { 
        wSegTroPe8090m = refreshWSegTroPe8090m();
     }
   		return wSegTroPe8090m;
   }

  
	/**
	*  set variable wSegTroPe8090m
	*  Corresponding COBOL Variable is W-SEG-TRO-PE8090M
	*  @param value
	**/
   public void setWSegTroPe8090m(char[] value) {
      wSegTroPe8090m = checkWSegTroPe8090mConstraints(value);
      serializeWSegTroPe8090m(wSegTroPe8090m);
   } 

     /**
	 * 	Update WSegTroPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTroPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWSegTroPe8090m,wSegTroPe8090m.length);
   	
   }
   
   public void setWSegTroPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWSegTroPe8090m,wSegTroPe8090m.length);
   	
   }
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWSegTroPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WSegTroPe8090m with another Field
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source) {
       replace(source,0,source.length(),beginWSegTroPe8090m,W_SEG_TRO_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWSegTroPe8090m,W_SEG_TRO_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WSegTroPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWSegTroPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wTitCtaAux
	 *	@return wTitCtaAux
	 */
   public char[] getWTitCtaAux() throws CFException{
     if (isWTitCtaAuxModified()) { 
        wTitCtaAux = refreshWTitCtaAux();
     }
   		return wTitCtaAux;
   }

  
	/**
	*  set variable wTitCtaAux
	*  Corresponding COBOL Variable is W-TIT-CTA-AUX
	*  @param value
	**/
   public void setWTitCtaAux(char[] value) {
      wTitCtaAux = checkWTitCtaAuxConstraints(value);
      serializeWTitCtaAux(wTitCtaAux);
   } 

     /**
	 * 	Update WTitCtaAux 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitCtaAux(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWTitCtaAux,wTitCtaAux.length);
   	
   }
   
   public void setWTitCtaAux(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWTitCtaAux,wTitCtaAux.length);
   	
   }
   
     /**
	 * 	Update WTitCtaAux 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaAux(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWTitCtaAux+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WTitCtaAux with another Field
	 *	@param value
	 */
   public void setWTitCtaAux(Field source) {
       replace(source,0,source.length(),beginWTitCtaAux,W_TIT_CTA_AUX_LEN);
   	
   }  
   
     /**
	 * 	Update WTitCtaAux 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitCtaAux(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWTitCtaAux,W_TIT_CTA_AUX_LEN);
   	
   }
   
     /**
	 * 	Update WTitCtaAux 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitCtaAux(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWTitCtaAux+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wPriTroAux
	 *	@return wPriTroAux
	 */
   public char[] getWPriTroAux() throws CFException{
     if (isWPriTroAuxModified()) { 
        wPriTroAux = refreshWPriTroAux();
     }
   		return wPriTroAux;
   }

  
	/**
	*  set variable wPriTroAux
	*  Corresponding COBOL Variable is W-PRI-TRO-AUX
	*  @param value
	**/
   public void setWPriTroAux(char[] value) {
      wPriTroAux = checkWPriTroAuxConstraints(value);
      serializeWPriTroAux(wPriTroAux);
   } 

     /**
	 * 	Update WPriTroAux 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPriTroAux(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWPriTroAux,wPriTroAux.length);
   	
   }
   
   public void setWPriTroAux(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWPriTroAux,wPriTroAux.length);
   	
   }
   
     /**
	 * 	Update WPriTroAux 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroAux(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPriTroAux+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WPriTroAux with another Field
	 *	@param value
	 */
   public void setWPriTroAux(Field source) {
       replace(source,0,source.length(),beginWPriTroAux,W_PRI_TRO_AUX_LEN);
   	
   }  
   
     /**
	 * 	Update WPriTroAux 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPriTroAux(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWPriTroAux,W_PRI_TRO_AUX_LEN);
   	
   }
   
     /**
	 * 	Update WPriTroAux 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPriTroAux(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPriTroAux+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wSegTroAux
	 *	@return wSegTroAux
	 */
   public char[] getWSegTroAux() throws CFException{
     if (isWSegTroAuxModified()) { 
        wSegTroAux = refreshWSegTroAux();
     }
   		return wSegTroAux;
   }

  
	/**
	*  set variable wSegTroAux
	*  Corresponding COBOL Variable is W-SEG-TRO-AUX
	*  @param value
	**/
   public void setWSegTroAux(char[] value) {
      wSegTroAux = checkWSegTroAuxConstraints(value);
      serializeWSegTroAux(wSegTroAux);
   } 

     /**
	 * 	Update WSegTroAux 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSegTroAux(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWSegTroAux,wSegTroAux.length);
   	
   }
   
   public void setWSegTroAux(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWSegTroAux,wSegTroAux.length);
   	
   }
   
     /**
	 * 	Update WSegTroAux 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroAux(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWSegTroAux+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WSegTroAux with another Field
	 *	@param value
	 */
   public void setWSegTroAux(Field source) {
       replace(source,0,source.length(),beginWSegTroAux,W_SEG_TRO_AUX_LEN);
   	
   }  
   
     /**
	 * 	Update WSegTroAux 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSegTroAux(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWSegTroAux,W_SEG_TRO_AUX_LEN);
   	
   }
   
     /**
	 * 	Update WSegTroAux 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSegTroAux(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWSegTroAux+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wTpePe8090m
	 *	@return wTpePe8090m
	 */   
	 public WTpePe8090m getWTpePe8090m() {
   	return wTpePe8090m;
   }
   /**
	* 	Update WTpePe8090m with the passed value
	*   Corresponding COBOL Variable is W-TPE-PE8090M
	*	@param value
	*/
   public void setWTpePe8090m(char[] value) {
      wTpePe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WTpePe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWTpePe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wTpePe8090m.begin,wTpePe8090m.length());
   }
   
     /**
	 * 	Update WTpePe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTpePe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wTpePe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WTpePe8090m with another Field
	 *	@param value
	 */
   public void setWTpePe8090m(Field source) {
   	replace(source,0,source.length(),wTpePe8090m.begin,wTpePe8090m.length());
   }  
   
     /**
	 * 	Update WTpePe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWTpePe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wTpePe8090m.begin,wTpePe8090m.length());
   }
   
     /**
	 * 	Update WTpePe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTpePe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wTpePe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wTobPe8090m
	 *	@return wTobPe8090m
	 */   
	 public WTobPe8090m getWTobPe8090m() {
   	return wTobPe8090m;
   }
   /**
	* 	Update WTobPe8090m with the passed value
	*   Corresponding COBOL Variable is W-TOB-PE8090M
	*	@param value
	*/
   public void setWTobPe8090m(char[] value) {
      wTobPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WTobPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWTobPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wTobPe8090m.begin,wTobPe8090m.length());
   }
   
     /**
	 * 	Update WTobPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTobPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wTobPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WTobPe8090m with another Field
	 *	@param value
	 */
   public void setWTobPe8090m(Field source) {
   	replace(source,0,source.length(),wTobPe8090m.begin,wTobPe8090m.length());
   }  
   
     /**
	 * 	Update WTobPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWTobPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wTobPe8090m.begin,wTobPe8090m.length());
   }
   
     /**
	 * 	Update WTobPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTobPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wTobPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wDatVarPe8090m
	 *	@return wDatVarPe8090m
	 */   
	 public WDatVarPe8090m getWDatVarPe8090m() {
   	return wDatVarPe8090m;
   }
   /**
	* 	Update WDatVarPe8090m with the passed value
	*   Corresponding COBOL Variable is W-DAT-VAR-PE8090M
	*	@param value
	*/
   public void setWDatVarPe8090m(char[] value) {
      wDatVarPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WDatVarPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWDatVarPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wDatVarPe8090m.begin,wDatVarPe8090m.length());
   }
   
     /**
	 * 	Update WDatVarPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWDatVarPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wDatVarPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WDatVarPe8090m with another Field
	 *	@param value
	 */
   public void setWDatVarPe8090m(Field source) {
   	replace(source,0,source.length(),wDatVarPe8090m.begin,wDatVarPe8090m.length());
   }  
   
     /**
	 * 	Update WDatVarPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWDatVarPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wDatVarPe8090m.begin,wDatVarPe8090m.length());
   }
   
     /**
	 * 	Update WDatVarPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWDatVarPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wDatVarPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wZonAlmPe8090m
	 *	@return wZonAlmPe8090m
	 */   
	 public WZonAlmPe8090m getWZonAlmPe8090m() {
   	return wZonAlmPe8090m;
   }
   /**
	* 	Update WZonAlmPe8090m with the passed value
	*   Corresponding COBOL Variable is W-ZON-ALM-PE8090M
	*	@param value
	*/
   public void setWZonAlmPe8090m(char[] value) {
      wZonAlmPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WZonAlmPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWZonAlmPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wZonAlmPe8090m.begin,wZonAlmPe8090m.length());
   }
   
     /**
	 * 	Update WZonAlmPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWZonAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wZonAlmPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WZonAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWZonAlmPe8090m(Field source) {
   	replace(source,0,source.length(),wZonAlmPe8090m.begin,wZonAlmPe8090m.length());
   }  
   
     /**
	 * 	Update WZonAlmPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWZonAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wZonAlmPe8090m.begin,wZonAlmPe8090m.length());
   }
   
     /**
	 * 	Update WZonAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWZonAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wZonAlmPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wIniNomaPe8090m
	 *	@return wIniNomaPe8090m
	 */   
	 public WIniNomaPe8090m getWIniNomaPe8090m() {
   	return wIniNomaPe8090m;
   }
   /**
	* 	Update WIniNomaPe8090m with the passed value
	*   Corresponding COBOL Variable is W-INI-NOMA-PE8090M
	*	@param value
	*/
   public void setWIniNomaPe8090m(char[] value) {
      wIniNomaPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WIniNomaPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWIniNomaPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomaPe8090m.begin,wIniNomaPe8090m.length());
   }
   
     /**
	 * 	Update WIniNomaPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIniNomaPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomaPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WIniNomaPe8090m with another Field
	 *	@param value
	 */
   public void setWIniNomaPe8090m(Field source) {
   	replace(source,0,source.length(),wIniNomaPe8090m.begin,wIniNomaPe8090m.length());
   }  
   
     /**
	 * 	Update WIniNomaPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWIniNomaPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomaPe8090m.begin,wIniNomaPe8090m.length());
   }
   
     /**
	 * 	Update WIniNomaPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIniNomaPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomaPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wIniNomrPe8090m
	 *	@return wIniNomrPe8090m
	 */   
	 public WIniNomrPe8090m getWIniNomrPe8090m() {
   	return wIniNomrPe8090m;
   }
   /**
	* 	Update WIniNomrPe8090m with the passed value
	*   Corresponding COBOL Variable is W-INI-NOMR-PE8090M
	*	@param value
	*/
   public void setWIniNomrPe8090m(char[] value) {
      wIniNomrPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WIniNomrPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWIniNomrPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomrPe8090m.begin,wIniNomrPe8090m.length());
   }
   
     /**
	 * 	Update WIniNomrPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIniNomrPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomrPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WIniNomrPe8090m with another Field
	 *	@param value
	 */
   public void setWIniNomrPe8090m(Field source) {
   	replace(source,0,source.length(),wIniNomrPe8090m.begin,wIniNomrPe8090m.length());
   }  
   
     /**
	 * 	Update WIniNomrPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWIniNomrPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomrPe8090m.begin,wIniNomrPe8090m.length());
   }
   
     /**
	 * 	Update WIniNomrPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIniNomrPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomrPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wZonFpfPe8090m
	 *	@return wZonFpfPe8090m
	 */   
	 public WZonFpfPe8090m getWZonFpfPe8090m() {
   	return wZonFpfPe8090m;
   }
   /**
	* 	Update WZonFpfPe8090m with the passed value
	*   Corresponding COBOL Variable is W-ZON-FPF-PE8090M
	*	@param value
	*/
   public void setWZonFpfPe8090m(char[] value) {
      wZonFpfPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WZonFpfPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWZonFpfPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wZonFpfPe8090m.begin,wZonFpfPe8090m.length());
   }
   
     /**
	 * 	Update WZonFpfPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWZonFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wZonFpfPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WZonFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWZonFpfPe8090m(Field source) {
   	replace(source,0,source.length(),wZonFpfPe8090m.begin,wZonFpfPe8090m.length());
   }  
   
     /**
	 * 	Update WZonFpfPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWZonFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wZonFpfPe8090m.begin,wZonFpfPe8090m.length());
   }
   
     /**
	 * 	Update WZonFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWZonFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wZonFpfPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wAstPapPe8090m
	 *	@return wAstPapPe8090m
	 */   
	 public WAstPapPe8090m getWAstPapPe8090m() {
   	return wAstPapPe8090m;
   }
   /**
	* 	Update WAstPapPe8090m with the passed value
	*   Corresponding COBOL Variable is W-AST-PAP-PE8090M
	*	@param value
	*/
   public void setWAstPapPe8090m(char[] value) {
      wAstPapPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WAstPapPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWAstPapPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wAstPapPe8090m.begin,wAstPapPe8090m.length());
   }
   
     /**
	 * 	Update WAstPapPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWAstPapPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wAstPapPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WAstPapPe8090m with another Field
	 *	@param value
	 */
   public void setWAstPapPe8090m(Field source) {
   	replace(source,0,source.length(),wAstPapPe8090m.begin,wAstPapPe8090m.length());
   }  
   
     /**
	 * 	Update WAstPapPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWAstPapPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wAstPapPe8090m.begin,wAstPapPe8090m.length());
   }
   
     /**
	 * 	Update WAstPapPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWAstPapPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wAstPapPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wAstJurPe8090m
	 *	@return wAstJurPe8090m
	 */   
	 public WAstJurPe8090m getWAstJurPe8090m() {
   	return wAstJurPe8090m;
   }
   /**
	* 	Update WAstJurPe8090m with the passed value
	*   Corresponding COBOL Variable is W-AST-JUR-PE8090M
	*	@param value
	*/
   public void setWAstJurPe8090m(char[] value) {
      wAstJurPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WAstJurPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWAstJurPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wAstJurPe8090m.begin,wAstJurPe8090m.length());
   }
   
     /**
	 * 	Update WAstJurPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWAstJurPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wAstJurPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WAstJurPe8090m with another Field
	 *	@param value
	 */
   public void setWAstJurPe8090m(Field source) {
   	replace(source,0,source.length(),wAstJurPe8090m.begin,wAstJurPe8090m.length());
   }  
   
     /**
	 * 	Update WAstJurPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWAstJurPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wAstJurPe8090m.begin,wAstJurPe8090m.length());
   }
   
     /**
	 * 	Update WAstJurPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWAstJurPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wAstJurPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wImpPe8090m
	 *	@return wImpPe8090m
	 */
	public int getWImpPe8090m() throws CFException {
        if (isWImpPe8090mModified()) { 
           wImpPe8090m = refreshWImpPe8090m();
        }
   		return wImpPe8090m;
	}
	
	/**
	 * 	Update WImpPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-IMP-PE8090M
	 *	@param number
	 */
	public void setWImpPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wImpPe8090m = checkWImpPe8090mMaxLimit(number); 
		serializeWImpPe8090m(wImpPe8090m);
	}


	public void setWImpPe8090m(long number) {
	    number = checkWImpPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWImpPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wTitulPe8090m
	 *	@return wTitulPe8090m
	 */
   public char[] getWTitulPe8090m() throws CFException{
     if (isWTitulPe8090mModified()) { 
        wTitulPe8090m = refreshWTitulPe8090m();
     }
   		return wTitulPe8090m;
   }

  
	/**
	*  set variable wTitulPe8090m
	*  Corresponding COBOL Variable is W-TITUL-PE8090M
	*  @param value
	**/
   public void setWTitulPe8090m(char[] value) {
      wTitulPe8090m = checkWTitulPe8090mConstraints(value);
      serializeWTitulPe8090m(wTitulPe8090m);
   } 

     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWTitulPe8090m,wTitulPe8090m.length);
   	
   }
   
   public void setWTitulPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWTitulPe8090m,wTitulPe8090m.length);
   	
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWTitulPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WTitulPe8090m with another Field
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source) {
       replace(source,0,source.length(),beginWTitulPe8090m,W_TITUL_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWTitulPe8090m,W_TITUL_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WTitulPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWTitulPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWTitulPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wIniNomPe8090m
	 *	@return wIniNomPe8090m
	 */   
	 public WIniNomPe8090m getWIniNomPe8090m() {
   	return wIniNomPe8090m;
   }
   /**
	* 	Update WIniNomPe8090m with the passed value
	*   Corresponding COBOL Variable is W-INI-NOM-PE8090M
	*	@param value
	*/
   public void setWIniNomPe8090m(char[] value) {
      wIniNomPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WIniNomPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWIniNomPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomPe8090m.begin,wIniNomPe8090m.length());
   }
   
     /**
	 * 	Update WIniNomPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIniNomPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WIniNomPe8090m with another Field
	 *	@param value
	 */
   public void setWIniNomPe8090m(Field source) {
   	replace(source,0,source.length(),wIniNomPe8090m.begin,wIniNomPe8090m.length());
   }  
   
     /**
	 * 	Update WIniNomPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWIniNomPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomPe8090m.begin,wIniNomPe8090m.length());
   }
   
     /**
	 * 	Update WIniNomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIniNomPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wIniNomPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wNumPerFisPe8090m
	 *	@return wNumPerFisPe8090m
	 */
	public int getWNumPerFisPe8090m() throws CFException {
        if (isWNumPerFisPe8090mModified()) { 
           wNumPerFisPe8090m = refreshWNumPerFisPe8090m();
        }
   		return wNumPerFisPe8090m;
	}
	
	/**
	 * 	Update WNumPerFisPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NUM-PER-FIS-PE8090M
	 *	@param number
	 */
	public void setWNumPerFisPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNumPerFisPe8090m = checkWNumPerFisPe8090mMaxLimit(number); 
		serializeWNumPerFisPe8090m(wNumPerFisPe8090m);
	}


	public void setWNumPerFisPe8090m(long number) {
	    number = checkWNumPerFisPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNumPerFisPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wMcas3Pe8090m
	 *	@return wMcas3Pe8090m
	 */   
	 public WMcas3Pe8090m getWMcas3Pe8090m() {
   	return wMcas3Pe8090m;
   }
   /**
	* 	Update WMcas3Pe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAS3-PE8090M
	*	@param value
	*/
   public void setWMcas3Pe8090m(char[] value) {
      wMcas3Pe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcas3Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas3Pe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3Pe8090m.begin,wMcas3Pe8090m.length());
   }
   
     /**
	 * 	Update WMcas3Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3Pe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcas3Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcas3Pe8090m(Field source) {
   	replace(source,0,source.length(),wMcas3Pe8090m.begin,wMcas3Pe8090m.length());
   }  
   
     /**
	 * 	Update WMcas3Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas3Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3Pe8090m.begin,wMcas3Pe8090m.length());
   }
   
     /**
	 * 	Update WMcas3Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3Pe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcas3aPe8090m
	 *	@return wMcas3aPe8090m
	 */   
	 public WMcas3aPe8090m getWMcas3aPe8090m() {
   	return wMcas3aPe8090m;
   }
   /**
	* 	Update WMcas3aPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAS3A-PE8090M
	*	@param value
	*/
   public void setWMcas3aPe8090m(char[] value) {
      wMcas3aPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcas3aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas3aPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3aPe8090m.begin,wMcas3aPe8090m.length());
   }
   
     /**
	 * 	Update WMcas3aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3aPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcas3aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas3aPe8090m(Field source) {
   	replace(source,0,source.length(),wMcas3aPe8090m.begin,wMcas3aPe8090m.length());
   }  
   
     /**
	 * 	Update WMcas3aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas3aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3aPe8090m.begin,wMcas3aPe8090m.length());
   }
   
     /**
	 * 	Update WMcas3aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3aPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcas3bPe8090m
	 *	@return wMcas3bPe8090m
	 */   
	 public WMcas3bPe8090m getWMcas3bPe8090m() {
   	return wMcas3bPe8090m;
   }
   /**
	* 	Update WMcas3bPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAS3B-PE8090M
	*	@param value
	*/
   public void setWMcas3bPe8090m(char[] value) {
      wMcas3bPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcas3bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas3bPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3bPe8090m.begin,wMcas3bPe8090m.length());
   }
   
     /**
	 * 	Update WMcas3bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3bPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcas3bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas3bPe8090m(Field source) {
   	replace(source,0,source.length(),wMcas3bPe8090m.begin,wMcas3bPe8090m.length());
   }  
   
     /**
	 * 	Update WMcas3bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas3bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3bPe8090m.begin,wMcas3bPe8090m.length());
   }
   
     /**
	 * 	Update WMcas3bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas3bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas3bPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcat3Pe8090m
	 *	@return wMcat3Pe8090m
	 */   
	 public WMcat3Pe8090m getWMcat3Pe8090m() {
   	return wMcat3Pe8090m;
   }
   /**
	* 	Update WMcat3Pe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAT3-PE8090M
	*	@param value
	*/
   public void setWMcat3Pe8090m(char[] value) {
      wMcat3Pe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcat3Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat3Pe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3Pe8090m.begin,wMcat3Pe8090m.length());
   }
   
     /**
	 * 	Update WMcat3Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3Pe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcat3Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcat3Pe8090m(Field source) {
   	replace(source,0,source.length(),wMcat3Pe8090m.begin,wMcat3Pe8090m.length());
   }  
   
     /**
	 * 	Update WMcat3Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat3Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3Pe8090m.begin,wMcat3Pe8090m.length());
   }
   
     /**
	 * 	Update WMcat3Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3Pe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcat3aPe8090m
	 *	@return wMcat3aPe8090m
	 */   
	 public WMcat3aPe8090m getWMcat3aPe8090m() {
   	return wMcat3aPe8090m;
   }
   /**
	* 	Update WMcat3aPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAT3A-PE8090M
	*	@param value
	*/
   public void setWMcat3aPe8090m(char[] value) {
      wMcat3aPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcat3aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat3aPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3aPe8090m.begin,wMcat3aPe8090m.length());
   }
   
     /**
	 * 	Update WMcat3aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3aPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcat3aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat3aPe8090m(Field source) {
   	replace(source,0,source.length(),wMcat3aPe8090m.begin,wMcat3aPe8090m.length());
   }  
   
     /**
	 * 	Update WMcat3aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat3aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3aPe8090m.begin,wMcat3aPe8090m.length());
   }
   
     /**
	 * 	Update WMcat3aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3aPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcat3bPe8090m
	 *	@return wMcat3bPe8090m
	 */   
	 public WMcat3bPe8090m getWMcat3bPe8090m() {
   	return wMcat3bPe8090m;
   }
   /**
	* 	Update WMcat3bPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAT3B-PE8090M
	*	@param value
	*/
   public void setWMcat3bPe8090m(char[] value) {
      wMcat3bPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcat3bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat3bPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3bPe8090m.begin,wMcat3bPe8090m.length());
   }
   
     /**
	 * 	Update WMcat3bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3bPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcat3bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat3bPe8090m(Field source) {
   	replace(source,0,source.length(),wMcat3bPe8090m.begin,wMcat3bPe8090m.length());
   }  
   
     /**
	 * 	Update WMcat3bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat3bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3bPe8090m.begin,wMcat3bPe8090m.length());
   }
   
     /**
	 * 	Update WMcat3bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat3bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat3bPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcas6Pe8090m
	 *	@return wMcas6Pe8090m
	 */   
	 public WMcas6Pe8090m getWMcas6Pe8090m() {
   	return wMcas6Pe8090m;
   }
   /**
	* 	Update WMcas6Pe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAS6-PE8090M
	*	@param value
	*/
   public void setWMcas6Pe8090m(char[] value) {
      wMcas6Pe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcas6Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas6Pe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6Pe8090m.begin,wMcas6Pe8090m.length());
   }
   
     /**
	 * 	Update WMcas6Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6Pe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcas6Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcas6Pe8090m(Field source) {
   	replace(source,0,source.length(),wMcas6Pe8090m.begin,wMcas6Pe8090m.length());
   }  
   
     /**
	 * 	Update WMcas6Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas6Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6Pe8090m.begin,wMcas6Pe8090m.length());
   }
   
     /**
	 * 	Update WMcas6Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6Pe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcas6aPe8090m
	 *	@return wMcas6aPe8090m
	 */   
	 public WMcas6aPe8090m getWMcas6aPe8090m() {
   	return wMcas6aPe8090m;
   }
   /**
	* 	Update WMcas6aPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAS6A-PE8090M
	*	@param value
	*/
   public void setWMcas6aPe8090m(char[] value) {
      wMcas6aPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcas6aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas6aPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6aPe8090m.begin,wMcas6aPe8090m.length());
   }
   
     /**
	 * 	Update WMcas6aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6aPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcas6aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas6aPe8090m(Field source) {
   	replace(source,0,source.length(),wMcas6aPe8090m.begin,wMcas6aPe8090m.length());
   }  
   
     /**
	 * 	Update WMcas6aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas6aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6aPe8090m.begin,wMcas6aPe8090m.length());
   }
   
     /**
	 * 	Update WMcas6aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6aPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcas6bPe8090m
	 *	@return wMcas6bPe8090m
	 */   
	 public WMcas6bPe8090m getWMcas6bPe8090m() {
   	return wMcas6bPe8090m;
   }
   /**
	* 	Update WMcas6bPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAS6B-PE8090M
	*	@param value
	*/
   public void setWMcas6bPe8090m(char[] value) {
      wMcas6bPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcas6bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas6bPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6bPe8090m.begin,wMcas6bPe8090m.length());
   }
   
     /**
	 * 	Update WMcas6bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6bPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcas6bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas6bPe8090m(Field source) {
   	replace(source,0,source.length(),wMcas6bPe8090m.begin,wMcas6bPe8090m.length());
   }  
   
     /**
	 * 	Update WMcas6bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas6bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6bPe8090m.begin,wMcas6bPe8090m.length());
   }
   
     /**
	 * 	Update WMcas6bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas6bPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcat6Pe8090m
	 *	@return wMcat6Pe8090m
	 */   
	 public WMcat6Pe8090m getWMcat6Pe8090m() {
   	return wMcat6Pe8090m;
   }
   /**
	* 	Update WMcat6Pe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAT6-PE8090M
	*	@param value
	*/
   public void setWMcat6Pe8090m(char[] value) {
      wMcat6Pe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcat6Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat6Pe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6Pe8090m.begin,wMcat6Pe8090m.length());
   }
   
     /**
	 * 	Update WMcat6Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6Pe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcat6Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcat6Pe8090m(Field source) {
   	replace(source,0,source.length(),wMcat6Pe8090m.begin,wMcat6Pe8090m.length());
   }  
   
     /**
	 * 	Update WMcat6Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat6Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6Pe8090m.begin,wMcat6Pe8090m.length());
   }
   
     /**
	 * 	Update WMcat6Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6Pe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcat6aPe8090m
	 *	@return wMcat6aPe8090m
	 */   
	 public WMcat6aPe8090m getWMcat6aPe8090m() {
   	return wMcat6aPe8090m;
   }
   /**
	* 	Update WMcat6aPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAT6A-PE8090M
	*	@param value
	*/
   public void setWMcat6aPe8090m(char[] value) {
      wMcat6aPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcat6aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat6aPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6aPe8090m.begin,wMcat6aPe8090m.length());
   }
   
     /**
	 * 	Update WMcat6aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6aPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcat6aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat6aPe8090m(Field source) {
   	replace(source,0,source.length(),wMcat6aPe8090m.begin,wMcat6aPe8090m.length());
   }  
   
     /**
	 * 	Update WMcat6aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat6aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6aPe8090m.begin,wMcat6aPe8090m.length());
   }
   
     /**
	 * 	Update WMcat6aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6aPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcat6bPe8090m
	 *	@return wMcat6bPe8090m
	 */   
	 public WMcat6bPe8090m getWMcat6bPe8090m() {
   	return wMcat6bPe8090m;
   }
   /**
	* 	Update WMcat6bPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAT6B-PE8090M
	*	@param value
	*/
   public void setWMcat6bPe8090m(char[] value) {
      wMcat6bPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcat6bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat6bPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6bPe8090m.begin,wMcat6bPe8090m.length());
   }
   
     /**
	 * 	Update WMcat6bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6bPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcat6bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat6bPe8090m(Field source) {
   	replace(source,0,source.length(),wMcat6bPe8090m.begin,wMcat6bPe8090m.length());
   }  
   
     /**
	 * 	Update WMcat6bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat6bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6bPe8090m.begin,wMcat6bPe8090m.length());
   }
   
     /**
	 * 	Update WMcat6bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat6bPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcas7Pe8090m
	 *	@return wMcas7Pe8090m
	 */   
	 public WMcas7Pe8090m getWMcas7Pe8090m() {
   	return wMcas7Pe8090m;
   }
   /**
	* 	Update WMcas7Pe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAS7-PE8090M
	*	@param value
	*/
   public void setWMcas7Pe8090m(char[] value) {
      wMcas7Pe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcas7Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas7Pe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7Pe8090m.begin,wMcas7Pe8090m.length());
   }
   
     /**
	 * 	Update WMcas7Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7Pe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcas7Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcas7Pe8090m(Field source) {
   	replace(source,0,source.length(),wMcas7Pe8090m.begin,wMcas7Pe8090m.length());
   }  
   
     /**
	 * 	Update WMcas7Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas7Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7Pe8090m.begin,wMcas7Pe8090m.length());
   }
   
     /**
	 * 	Update WMcas7Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7Pe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcas7aPe8090m
	 *	@return wMcas7aPe8090m
	 */   
	 public WMcas7aPe8090m getWMcas7aPe8090m() {
   	return wMcas7aPe8090m;
   }
   /**
	* 	Update WMcas7aPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAS7A-PE8090M
	*	@param value
	*/
   public void setWMcas7aPe8090m(char[] value) {
      wMcas7aPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcas7aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas7aPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7aPe8090m.begin,wMcas7aPe8090m.length());
   }
   
     /**
	 * 	Update WMcas7aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7aPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcas7aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas7aPe8090m(Field source) {
   	replace(source,0,source.length(),wMcas7aPe8090m.begin,wMcas7aPe8090m.length());
   }  
   
     /**
	 * 	Update WMcas7aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas7aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7aPe8090m.begin,wMcas7aPe8090m.length());
   }
   
     /**
	 * 	Update WMcas7aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7aPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcas7bPe8090m
	 *	@return wMcas7bPe8090m
	 */   
	 public WMcas7bPe8090m getWMcas7bPe8090m() {
   	return wMcas7bPe8090m;
   }
   /**
	* 	Update WMcas7bPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAS7B-PE8090M
	*	@param value
	*/
   public void setWMcas7bPe8090m(char[] value) {
      wMcas7bPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcas7bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcas7bPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7bPe8090m.begin,wMcas7bPe8090m.length());
   }
   
     /**
	 * 	Update WMcas7bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7bPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcas7bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas7bPe8090m(Field source) {
   	replace(source,0,source.length(),wMcas7bPe8090m.begin,wMcas7bPe8090m.length());
   }  
   
     /**
	 * 	Update WMcas7bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcas7bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7bPe8090m.begin,wMcas7bPe8090m.length());
   }
   
     /**
	 * 	Update WMcas7bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcas7bPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcat7Pe8090m
	 *	@return wMcat7Pe8090m
	 */   
	 public WMcat7Pe8090m getWMcat7Pe8090m() {
   	return wMcat7Pe8090m;
   }
   /**
	* 	Update WMcat7Pe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAT7-PE8090M
	*	@param value
	*/
   public void setWMcat7Pe8090m(char[] value) {
      wMcat7Pe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcat7Pe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat7Pe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7Pe8090m.begin,wMcat7Pe8090m.length());
   }
   
     /**
	 * 	Update WMcat7Pe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7Pe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcat7Pe8090m with another Field
	 *	@param value
	 */
   public void setWMcat7Pe8090m(Field source) {
   	replace(source,0,source.length(),wMcat7Pe8090m.begin,wMcat7Pe8090m.length());
   }  
   
     /**
	 * 	Update WMcat7Pe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat7Pe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7Pe8090m.begin,wMcat7Pe8090m.length());
   }
   
     /**
	 * 	Update WMcat7Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7Pe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcat7aPe8090m
	 *	@return wMcat7aPe8090m
	 */   
	 public WMcat7aPe8090m getWMcat7aPe8090m() {
   	return wMcat7aPe8090m;
   }
   /**
	* 	Update WMcat7aPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAT7A-PE8090M
	*	@param value
	*/
   public void setWMcat7aPe8090m(char[] value) {
      wMcat7aPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcat7aPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat7aPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7aPe8090m.begin,wMcat7aPe8090m.length());
   }
   
     /**
	 * 	Update WMcat7aPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7aPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7aPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcat7aPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat7aPe8090m(Field source) {
   	replace(source,0,source.length(),wMcat7aPe8090m.begin,wMcat7aPe8090m.length());
   }  
   
     /**
	 * 	Update WMcat7aPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat7aPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7aPe8090m.begin,wMcat7aPe8090m.length());
   }
   
     /**
	 * 	Update WMcat7aPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7aPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7aPe8090m.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wMcat7bPe8090m
	 *	@return wMcat7bPe8090m
	 */   
	 public WMcat7bPe8090m getWMcat7bPe8090m() {
   	return wMcat7bPe8090m;
   }
   /**
	* 	Update WMcat7bPe8090m with the passed value
	*   Corresponding COBOL Variable is W-MCAT7B-PE8090M
	*	@param value
	*/
   public void setWMcat7bPe8090m(char[] value) {
      wMcat7bPe8090m.setString(value); 
   }   
    
     /**
	 * 	Update WMcat7bPe8090m 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWMcat7bPe8090m(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7bPe8090m.begin,wMcat7bPe8090m.length());
   }
   
     /**
	 * 	Update WMcat7bPe8090m 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7bPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7bPe8090m.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WMcat7bPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat7bPe8090m(Field source) {
   	replace(source,0,source.length(),wMcat7bPe8090m.begin,wMcat7bPe8090m.length());
   }  
   
     /**
	 * 	Update WMcat7bPe8090m 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWMcat7bPe8090m(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7bPe8090m.begin,wMcat7bPe8090m.length());
   }
   
     /**
	 * 	Update WMcat7bPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7bPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wMcat7bPe8090m.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Section
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWIndxTitular(0);
                     setWTotTit(0);
         setWPriTitu(CONSTANTS.SPACE_60);
                     setWLonPriTitu(0);
         setWSegTitu(CONSTANTS.SPACE_60);
                     setWLonSegTitu(0);
         setWTitCtaPe8090m(CONSTANTS.SPACE_100);
         setWPriTroPe8090m(CONSTANTS.SPACE_50);
         setWSegTroPe8090m(CONSTANTS.SPACE_50);
         setWTitCtaAux(CONSTANTS.SPACE_100);
         setWPriTroAux(CONSTANTS.SPACE_50);
         setWSegTroAux(CONSTANTS.SPACE_50);
          wTpePe8090m.initialize();
     
          wTobPe8090m.initialize();
     
          wDatVarPe8090m.initialize();
     
          wZonAlmPe8090m.initialize();
     
          wIniNomaPe8090m.initialize();
     
          wZonFpfPe8090m.initialize();
     
          wAstPapPe8090m.initialize();
     
          wAstJurPe8090m.initialize();
     
                     setWImpPe8090m(0);
         setWTitulPe8090m(CONSTANTS.SPACE_140);
          wIniNomPe8090m.initialize();
     
                     setWNumPerFisPe8090m(0);
          wMcas3Pe8090m.initialize();
     
          wMcas3aPe8090m.initialize();
     
          wMcas3bPe8090m.initialize();
     
          wMcat3Pe8090m.initialize();
     
          wMcat3aPe8090m.initialize();
     
          wMcat3bPe8090m.initialize();
     
          wMcas6Pe8090m.initialize();
     
          wMcas6aPe8090m.initialize();
     
          wMcas6bPe8090m.initialize();
     
          wMcat6Pe8090m.initialize();
     
          wMcat6aPe8090m.initialize();
     
          wMcat6bPe8090m.initialize();
     
          wMcas7Pe8090m.initialize();
     
          wMcas7aPe8090m.initialize();
     
          wMcas7bPe8090m.initialize();
     
          wMcat7Pe8090m.initialize();
     
          wMcat7aPe8090m.initialize();
     
          wMcat7bPe8090m.initialize();
     
   }

		public static int getSectionFieldLength() {
			return SECTION_LENGTH;
		}

}
  
