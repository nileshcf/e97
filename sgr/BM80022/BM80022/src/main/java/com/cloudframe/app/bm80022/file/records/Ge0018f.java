package com.cloudframe.app.bm80022.file.records;

/**
*  The class Ge0018f is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.bm80022.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ge0018f extends Ge0018fSerialized { 
   

						private char[] ge0018fCodentid = Field.fillLowValue(2);

						private char[] ge0018fTipproduct = Field.fillLowValue(3);

								private long ge0018fCodcontrat;

								private int ge0018fOfigestora;

						private char[] ge0018fIdepsig = Field.fillLowValue(12);

								private int ge0018fNumpersona;

								private long ge0018fNumcartera;

						private char[] ge0018fCodcartera = Field.fillLowValue(8);

						private char[] ge0018fFechaalta = Field.fillLowValue(10);

						private char[] ge0018fFechabaja = Field.fillLowValue(10);

						private char[] ge0018fCodnodo = Field.fillLowValue(8);

						private char[] ge0018fResambito = Field.fillLowValue(12);

								private int ge0018fNumresamb;

								private int ge0018fNumpresamb;

						private char[] ge0018fCengescapt = Field.fillLowValue(8);

								private int ge0018fNumgescap;

								private int ge0018fNumpgescap;

								private int ge0018fNumpesprie;

						private char[] ge0018fCodcarrie = Field.fillLowValue(8);

						private char[] ge0018fFecciecurso = Field.fillLowValue(10);
	
	/**
	* Constructor for Ge0018f
	**/
    public Ge0018f() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ge0018fCodentid
	 *	@return ge0018fCodentid
	 */
   public char[] getGe0018fCodentid() throws CFException{
     if (isGe0018fCodentidModified()) { 
        ge0018fCodentid = refreshGe0018fCodentid();
     }
   		return ge0018fCodentid;
   }

  
	/**
	*  set variable ge0018fCodentid
	*  Corresponding COBOL Variable is GE0018F-CODENTID
	*  @param value
	**/
   public void setGe0018fCodentid(char[] value) {
      ge0018fCodentid = checkGe0018fCodentidConstraints(value);
      serializeGe0018fCodentid(ge0018fCodentid);
   } 

     /**
	 * 	Update Ge0018fCodentid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fCodentid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGe0018fCodentid,ge0018fCodentid.length);
   	
   }
   
   public void setGe0018fCodentid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodentid,ge0018fCodentid.length);
   	
   }
   
     /**
	 * 	Update Ge0018fCodentid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodentid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodentid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ge0018fCodentid with another Field
	 *	@param value
	 */
   public void setGe0018fCodentid(Field source) {
       replace(source,0,source.length(),beginGe0018fCodentid,GE_0018F_CODENTID_LEN);
   	
   }  
   
     /**
	 * 	Update Ge0018fCodentid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fCodentid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGe0018fCodentid,GE_0018F_CODENTID_LEN);
   	
   }
   
     /**
	 * 	Update Ge0018fCodentid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodentid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodentid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ge0018fTipproduct
	 *	@return ge0018fTipproduct
	 */
   public char[] getGe0018fTipproduct() throws CFException{
     if (isGe0018fTipproductModified()) { 
        ge0018fTipproduct = refreshGe0018fTipproduct();
     }
   		return ge0018fTipproduct;
   }

  
	/**
	*  set variable ge0018fTipproduct
	*  Corresponding COBOL Variable is GE0018F-TIPPRODUCT
	*  @param value
	**/
   public void setGe0018fTipproduct(char[] value) {
      ge0018fTipproduct = checkGe0018fTipproductConstraints(value);
      serializeGe0018fTipproduct(ge0018fTipproduct);
   } 

     /**
	 * 	Update Ge0018fTipproduct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fTipproduct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGe0018fTipproduct,ge0018fTipproduct.length);
   	
   }
   
   public void setGe0018fTipproduct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fTipproduct,ge0018fTipproduct.length);
   	
   }
   
     /**
	 * 	Update Ge0018fTipproduct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fTipproduct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fTipproduct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ge0018fTipproduct with another Field
	 *	@param value
	 */
   public void setGe0018fTipproduct(Field source) {
       replace(source,0,source.length(),beginGe0018fTipproduct,GE_0018F_TIPPRODUCT_LEN);
   	
   }  
   
     /**
	 * 	Update Ge0018fTipproduct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fTipproduct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGe0018fTipproduct,GE_0018F_TIPPRODUCT_LEN);
   	
   }
   
     /**
	 * 	Update Ge0018fTipproduct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fTipproduct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fTipproduct+targetIndex,targetLen);
    
   }
	public long getGe0018fCodcontrat() throws CFException {
        if (isGe0018fCodcontratModified()) { 
           ge0018fCodcontrat = refreshGe0018fCodcontrat();
        }
   		return ge0018fCodcontrat;
	}
	
	/**
	 * 	Update Ge0018fCodcontrat with the passed value
	 *  Corresponding COBOL Variable is GE0018F-CODCONTRAT
	 *	@param number
	 */
	public void setGe0018fCodcontrat(long number) {
			ge0018fCodcontrat = checkGe0018fCodcontratMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeGe0018fCodcontrat(ge0018fCodcontrat);
	}


	/**
	 *	Returns the value of ge0018fOfigestora
	 *	@return ge0018fOfigestora
	 */
	public int getGe0018fOfigestora() throws CFException {
       if (isGe0018fOfigestoraModified()) { 
           ge0018fOfigestora = refreshGe0018fOfigestora();
        }
   		return ge0018fOfigestora;
	}
	

	
	   
	/**
	 * 	Update Ge0018fOfigestora with the passed value
	 *  Corresponding COBOL Variable is GE0018F-OFIGESTORA
	 *	@param number
	 */
	public void setGe0018fOfigestora(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ge0018fOfigestora = checkGe0018fOfigestoraMaxLimit(number); 
		serializeGe0018fOfigestora(ge0018fOfigestora);
	}
	

	public void setGe0018fOfigestora(long number) {
	    number = checkGe0018fOfigestoraMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe0018fOfigestora((int)number);
	}
	
	/**
	 * 	Update Ge0018fOfigestora with the passed value
	 *	@param value (String or char[])
	 */
	public void setGe0018fOfigestora(char[] value) throws CFException {
		 ge0018fOfigestora = serializeGe0018fOfigestora(value);
	}
	/**
	 * 	Update Ge0018fOfigestora with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGe0018fOfigestoraString(char[] value) throws CFException {
		 setGe0018fOfigestora(value);
	}
	/**
	 *	Returns the value of ge0018fIdepsig
	 *	@return ge0018fIdepsig
	 */
   public char[] getGe0018fIdepsig() throws CFException{
     if (isGe0018fIdepsigModified()) { 
        ge0018fIdepsig = refreshGe0018fIdepsig();
     }
   		return ge0018fIdepsig;
   }

  
	/**
	*  set variable ge0018fIdepsig
	*  Corresponding COBOL Variable is GE0018F-IDEPSIG
	*  @param value
	**/
   public void setGe0018fIdepsig(char[] value) {
      ge0018fIdepsig = checkGe0018fIdepsigConstraints(value);
      serializeGe0018fIdepsig(ge0018fIdepsig);
   } 

     /**
	 * 	Update Ge0018fIdepsig 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fIdepsig(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGe0018fIdepsig,ge0018fIdepsig.length);
   	
   }
   
   public void setGe0018fIdepsig(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fIdepsig,ge0018fIdepsig.length);
   	
   }
   
     /**
	 * 	Update Ge0018fIdepsig 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fIdepsig(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fIdepsig+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ge0018fIdepsig with another Field
	 *	@param value
	 */
   public void setGe0018fIdepsig(Field source) {
       replace(source,0,source.length(),beginGe0018fIdepsig,GE_0018F_IDEPSIG_LEN);
   	
   }  
   
     /**
	 * 	Update Ge0018fIdepsig 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fIdepsig(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGe0018fIdepsig,GE_0018F_IDEPSIG_LEN);
   	
   }
   
     /**
	 * 	Update Ge0018fIdepsig 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fIdepsig(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fIdepsig+targetIndex,targetLen);
    
   }
	public int getGe0018fNumpersona() throws CFException {
        if (isGe0018fNumpersonaModified()) { 
           ge0018fNumpersona = refreshGe0018fNumpersona();
        }
   		return ge0018fNumpersona;
	}
	
	/**
	 * 	Update Ge0018fNumpersona with the passed value
	 *  Corresponding COBOL Variable is GE0018F-NUMPERSONA
	 *	@param number
	 */
	public void setGe0018fNumpersona(int number) {
			ge0018fNumpersona = checkGe0018fNumpersonaMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeGe0018fNumpersona(ge0018fNumpersona);
	}


	public void setGe0018fNumpersona(long number) {
	    number = checkGe0018fNumpersonaMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe0018fNumpersona((int)number);
	}
	
	/**
	 *	Returns the value of ge0018fNumcartera
	 *	@return ge0018fNumcartera
	 */
	public long getGe0018fNumcartera() throws CFException {
       if (isGe0018fNumcarteraModified()) { 
           ge0018fNumcartera = refreshGe0018fNumcartera();
        }
   		return ge0018fNumcartera;
	}
	

	
	   
	/**
	 * 	Update Ge0018fNumcartera with the passed value
	 *  Corresponding COBOL Variable is GE0018F-NUMCARTERA
	 *	@param number
	 */
	public void setGe0018fNumcartera(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ge0018fNumcartera = checkGe0018fNumcarteraMaxLimit(number); 
		serializeGe0018fNumcartera(ge0018fNumcartera);
	}
	

	/**
	 * 	Update Ge0018fNumcartera with the passed value
	 *	@param value (String or char[])
	 */
	public void setGe0018fNumcartera(char[] value) throws CFException {
		 ge0018fNumcartera = serializeGe0018fNumcartera(value);
	}
	/**
	 * 	Update Ge0018fNumcartera with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGe0018fNumcarteraString(char[] value) throws CFException {
		 setGe0018fNumcartera(value);
	}
	/**
	 *	Returns the value of ge0018fCodcartera
	 *	@return ge0018fCodcartera
	 */
   public char[] getGe0018fCodcartera() throws CFException{
     if (isGe0018fCodcarteraModified()) { 
        ge0018fCodcartera = refreshGe0018fCodcartera();
     }
   		return ge0018fCodcartera;
   }

  
	/**
	*  set variable ge0018fCodcartera
	*  Corresponding COBOL Variable is GE0018F-CODCARTERA
	*  @param value
	**/
   public void setGe0018fCodcartera(char[] value) {
      ge0018fCodcartera = checkGe0018fCodcarteraConstraints(value);
      serializeGe0018fCodcartera(ge0018fCodcartera);
   } 

     /**
	 * 	Update Ge0018fCodcartera 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fCodcartera(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGe0018fCodcartera,ge0018fCodcartera.length);
   	
   }
   
   public void setGe0018fCodcartera(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodcartera,ge0018fCodcartera.length);
   	
   }
   
     /**
	 * 	Update Ge0018fCodcartera 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodcartera(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodcartera+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ge0018fCodcartera with another Field
	 *	@param value
	 */
   public void setGe0018fCodcartera(Field source) {
       replace(source,0,source.length(),beginGe0018fCodcartera,GE_0018F_CODCARTERA_LEN);
   	
   }  
   
     /**
	 * 	Update Ge0018fCodcartera 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fCodcartera(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGe0018fCodcartera,GE_0018F_CODCARTERA_LEN);
   	
   }
   
     /**
	 * 	Update Ge0018fCodcartera 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodcartera(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodcartera+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ge0018fFechaalta
	 *	@return ge0018fFechaalta
	 */
   public char[] getGe0018fFechaalta() throws CFException{
     if (isGe0018fFechaaltaModified()) { 
        ge0018fFechaalta = refreshGe0018fFechaalta();
     }
   		return ge0018fFechaalta;
   }

  
	/**
	*  set variable ge0018fFechaalta
	*  Corresponding COBOL Variable is GE0018F-FECHAALTA
	*  @param value
	**/
   public void setGe0018fFechaalta(char[] value) {
      ge0018fFechaalta = checkGe0018fFechaaltaConstraints(value);
      serializeGe0018fFechaalta(ge0018fFechaalta);
   } 

     /**
	 * 	Update Ge0018fFechaalta 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fFechaalta(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGe0018fFechaalta,ge0018fFechaalta.length);
   	
   }
   
   public void setGe0018fFechaalta(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fFechaalta,ge0018fFechaalta.length);
   	
   }
   
     /**
	 * 	Update Ge0018fFechaalta 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFechaalta(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fFechaalta+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ge0018fFechaalta with another Field
	 *	@param value
	 */
   public void setGe0018fFechaalta(Field source) {
       replace(source,0,source.length(),beginGe0018fFechaalta,GE_0018F_FECHAALTA_LEN);
   	
   }  
   
     /**
	 * 	Update Ge0018fFechaalta 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fFechaalta(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGe0018fFechaalta,GE_0018F_FECHAALTA_LEN);
   	
   }
   
     /**
	 * 	Update Ge0018fFechaalta 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFechaalta(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fFechaalta+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ge0018fFechabaja
	 *	@return ge0018fFechabaja
	 */
   public char[] getGe0018fFechabaja() throws CFException{
     if (isGe0018fFechabajaModified()) { 
        ge0018fFechabaja = refreshGe0018fFechabaja();
     }
   		return ge0018fFechabaja;
   }

  
	/**
	*  set variable ge0018fFechabaja
	*  Corresponding COBOL Variable is GE0018F-FECHABAJA
	*  @param value
	**/
   public void setGe0018fFechabaja(char[] value) {
      ge0018fFechabaja = checkGe0018fFechabajaConstraints(value);
      serializeGe0018fFechabaja(ge0018fFechabaja);
   } 

     /**
	 * 	Update Ge0018fFechabaja 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fFechabaja(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGe0018fFechabaja,ge0018fFechabaja.length);
   	
   }
   
   public void setGe0018fFechabaja(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fFechabaja,ge0018fFechabaja.length);
   	
   }
   
     /**
	 * 	Update Ge0018fFechabaja 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFechabaja(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fFechabaja+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ge0018fFechabaja with another Field
	 *	@param value
	 */
   public void setGe0018fFechabaja(Field source) {
       replace(source,0,source.length(),beginGe0018fFechabaja,GE_0018F_FECHABAJA_LEN);
   	
   }  
   
     /**
	 * 	Update Ge0018fFechabaja 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fFechabaja(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGe0018fFechabaja,GE_0018F_FECHABAJA_LEN);
   	
   }
   
     /**
	 * 	Update Ge0018fFechabaja 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFechabaja(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fFechabaja+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ge0018fCodnodo
	 *	@return ge0018fCodnodo
	 */
   public char[] getGe0018fCodnodo() throws CFException{
     if (isGe0018fCodnodoModified()) { 
        ge0018fCodnodo = refreshGe0018fCodnodo();
     }
   		return ge0018fCodnodo;
   }

  
	/**
	*  set variable ge0018fCodnodo
	*  Corresponding COBOL Variable is GE0018F-CODNODO
	*  @param value
	**/
   public void setGe0018fCodnodo(char[] value) {
      ge0018fCodnodo = checkGe0018fCodnodoConstraints(value);
      serializeGe0018fCodnodo(ge0018fCodnodo);
   } 

     /**
	 * 	Update Ge0018fCodnodo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fCodnodo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGe0018fCodnodo,ge0018fCodnodo.length);
   	
   }
   
   public void setGe0018fCodnodo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodnodo,ge0018fCodnodo.length);
   	
   }
   
     /**
	 * 	Update Ge0018fCodnodo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodnodo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodnodo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ge0018fCodnodo with another Field
	 *	@param value
	 */
   public void setGe0018fCodnodo(Field source) {
       replace(source,0,source.length(),beginGe0018fCodnodo,GE_0018F_CODNODO_LEN);
   	
   }  
   
     /**
	 * 	Update Ge0018fCodnodo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fCodnodo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGe0018fCodnodo,GE_0018F_CODNODO_LEN);
   	
   }
   
     /**
	 * 	Update Ge0018fCodnodo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodnodo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodnodo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ge0018fResambito
	 *	@return ge0018fResambito
	 */
   public char[] getGe0018fResambito() throws CFException{
     if (isGe0018fResambitoModified()) { 
        ge0018fResambito = refreshGe0018fResambito();
     }
   		return ge0018fResambito;
   }

  
	/**
	*  set variable ge0018fResambito
	*  Corresponding COBOL Variable is GE0018F-RESAMBITO
	*  @param value
	**/
   public void setGe0018fResambito(char[] value) {
      ge0018fResambito = checkGe0018fResambitoConstraints(value);
      serializeGe0018fResambito(ge0018fResambito);
   } 

     /**
	 * 	Update Ge0018fResambito 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fResambito(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGe0018fResambito,ge0018fResambito.length);
   	
   }
   
   public void setGe0018fResambito(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fResambito,ge0018fResambito.length);
   	
   }
   
     /**
	 * 	Update Ge0018fResambito 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fResambito(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fResambito+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ge0018fResambito with another Field
	 *	@param value
	 */
   public void setGe0018fResambito(Field source) {
       replace(source,0,source.length(),beginGe0018fResambito,GE_0018F_RESAMBITO_LEN);
   	
   }  
   
     /**
	 * 	Update Ge0018fResambito 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fResambito(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGe0018fResambito,GE_0018F_RESAMBITO_LEN);
   	
   }
   
     /**
	 * 	Update Ge0018fResambito 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fResambito(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fResambito+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ge0018fNumresamb
	 *	@return ge0018fNumresamb
	 */
	public int getGe0018fNumresamb() throws CFException {
        if (isGe0018fNumresambModified()) { 
           ge0018fNumresamb = refreshGe0018fNumresamb();
        }
   		return ge0018fNumresamb;
	}
	
	/**
	 * 	Update Ge0018fNumresamb with the passed value
	 *  Corresponding COBOL Variable is GE0018F-NUMRESAMB
	 *	@param number
	 */
	public void setGe0018fNumresamb(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ge0018fNumresamb = checkGe0018fNumresambMaxLimit(number); 
		serializeGe0018fNumresamb(ge0018fNumresamb);
	}


	public void setGe0018fNumresamb(long number) {
	    number = checkGe0018fNumresambMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe0018fNumresamb((int)number);
	}
	
	public int getGe0018fNumpresamb() throws CFException {
        if (isGe0018fNumpresambModified()) { 
           ge0018fNumpresamb = refreshGe0018fNumpresamb();
        }
   		return ge0018fNumpresamb;
	}
	
	/**
	 * 	Update Ge0018fNumpresamb with the passed value
	 *  Corresponding COBOL Variable is GE0018F-NUMPRESAMB
	 *	@param number
	 */
	public void setGe0018fNumpresamb(int number) {
			ge0018fNumpresamb = checkGe0018fNumpresambMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeGe0018fNumpresamb(ge0018fNumpresamb);
	}


	public void setGe0018fNumpresamb(long number) {
	    number = checkGe0018fNumpresambMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe0018fNumpresamb((int)number);
	}
	
	/**
	 *	Returns the value of ge0018fCengescapt
	 *	@return ge0018fCengescapt
	 */
   public char[] getGe0018fCengescapt() throws CFException{
     if (isGe0018fCengescaptModified()) { 
        ge0018fCengescapt = refreshGe0018fCengescapt();
     }
   		return ge0018fCengescapt;
   }

  
	/**
	*  set variable ge0018fCengescapt
	*  Corresponding COBOL Variable is GE0018F-CENGESCAPT
	*  @param value
	**/
   public void setGe0018fCengescapt(char[] value) {
      ge0018fCengescapt = checkGe0018fCengescaptConstraints(value);
      serializeGe0018fCengescapt(ge0018fCengescapt);
   } 

     /**
	 * 	Update Ge0018fCengescapt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fCengescapt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGe0018fCengescapt,ge0018fCengescapt.length);
   	
   }
   
   public void setGe0018fCengescapt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCengescapt,ge0018fCengescapt.length);
   	
   }
   
     /**
	 * 	Update Ge0018fCengescapt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCengescapt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCengescapt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ge0018fCengescapt with another Field
	 *	@param value
	 */
   public void setGe0018fCengescapt(Field source) {
       replace(source,0,source.length(),beginGe0018fCengescapt,GE_0018F_CENGESCAPT_LEN);
   	
   }  
   
     /**
	 * 	Update Ge0018fCengescapt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fCengescapt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGe0018fCengescapt,GE_0018F_CENGESCAPT_LEN);
   	
   }
   
     /**
	 * 	Update Ge0018fCengescapt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCengescapt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCengescapt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ge0018fNumgescap
	 *	@return ge0018fNumgescap
	 */
	public int getGe0018fNumgescap() throws CFException {
        if (isGe0018fNumgescapModified()) { 
           ge0018fNumgescap = refreshGe0018fNumgescap();
        }
   		return ge0018fNumgescap;
	}
	
	/**
	 * 	Update Ge0018fNumgescap with the passed value
	 *  Corresponding COBOL Variable is GE0018F-NUMGESCAP
	 *	@param number
	 */
	public void setGe0018fNumgescap(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ge0018fNumgescap = checkGe0018fNumgescapMaxLimit(number); 
		serializeGe0018fNumgescap(ge0018fNumgescap);
	}


	public void setGe0018fNumgescap(long number) {
	    number = checkGe0018fNumgescapMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe0018fNumgescap((int)number);
	}
	
	public int getGe0018fNumpgescap() throws CFException {
        if (isGe0018fNumpgescapModified()) { 
           ge0018fNumpgescap = refreshGe0018fNumpgescap();
        }
   		return ge0018fNumpgescap;
	}
	
	/**
	 * 	Update Ge0018fNumpgescap with the passed value
	 *  Corresponding COBOL Variable is GE0018F-NUMPGESCAP
	 *	@param number
	 */
	public void setGe0018fNumpgescap(int number) {
			ge0018fNumpgescap = checkGe0018fNumpgescapMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeGe0018fNumpgescap(ge0018fNumpgescap);
	}


	public void setGe0018fNumpgescap(long number) {
	    number = checkGe0018fNumpgescapMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe0018fNumpgescap((int)number);
	}
	
	public int getGe0018fNumpesprie() throws CFException {
        if (isGe0018fNumpesprieModified()) { 
           ge0018fNumpesprie = refreshGe0018fNumpesprie();
        }
   		return ge0018fNumpesprie;
	}
	
	/**
	 * 	Update Ge0018fNumpesprie with the passed value
	 *  Corresponding COBOL Variable is GE0018F-NUMPESPRIE
	 *	@param number
	 */
	public void setGe0018fNumpesprie(int number) {
			ge0018fNumpesprie = checkGe0018fNumpesprieMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeGe0018fNumpesprie(ge0018fNumpesprie);
	}


	public void setGe0018fNumpesprie(long number) {
	    number = checkGe0018fNumpesprieMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGe0018fNumpesprie((int)number);
	}
	
	/**
	 *	Returns the value of ge0018fCodcarrie
	 *	@return ge0018fCodcarrie
	 */
   public char[] getGe0018fCodcarrie() throws CFException{
     if (isGe0018fCodcarrieModified()) { 
        ge0018fCodcarrie = refreshGe0018fCodcarrie();
     }
   		return ge0018fCodcarrie;
   }

  
	/**
	*  set variable ge0018fCodcarrie
	*  Corresponding COBOL Variable is GE0018F-CODCARRIE
	*  @param value
	**/
   public void setGe0018fCodcarrie(char[] value) {
      ge0018fCodcarrie = checkGe0018fCodcarrieConstraints(value);
      serializeGe0018fCodcarrie(ge0018fCodcarrie);
   } 

     /**
	 * 	Update Ge0018fCodcarrie 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fCodcarrie(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGe0018fCodcarrie,ge0018fCodcarrie.length);
   	
   }
   
   public void setGe0018fCodcarrie(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodcarrie,ge0018fCodcarrie.length);
   	
   }
   
     /**
	 * 	Update Ge0018fCodcarrie 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodcarrie(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodcarrie+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ge0018fCodcarrie with another Field
	 *	@param value
	 */
   public void setGe0018fCodcarrie(Field source) {
       replace(source,0,source.length(),beginGe0018fCodcarrie,GE_0018F_CODCARRIE_LEN);
   	
   }  
   
     /**
	 * 	Update Ge0018fCodcarrie 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fCodcarrie(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGe0018fCodcarrie,GE_0018F_CODCARRIE_LEN);
   	
   }
   
     /**
	 * 	Update Ge0018fCodcarrie 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fCodcarrie(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fCodcarrie+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ge0018fFecciecurso
	 *	@return ge0018fFecciecurso
	 */
   public char[] getGe0018fFecciecurso() throws CFException{
     if (isGe0018fFecciecursoModified()) { 
        ge0018fFecciecurso = refreshGe0018fFecciecurso();
     }
   		return ge0018fFecciecurso;
   }

  
	/**
	*  set variable ge0018fFecciecurso
	*  Corresponding COBOL Variable is GE0018F-FECCIECURSO
	*  @param value
	**/
   public void setGe0018fFecciecurso(char[] value) {
      ge0018fFecciecurso = checkGe0018fFecciecursoConstraints(value);
      serializeGe0018fFecciecurso(ge0018fFecciecurso);
   } 

     /**
	 * 	Update Ge0018fFecciecurso 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGe0018fFecciecurso(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGe0018fFecciecurso,ge0018fFecciecurso.length);
   	
   }
   
   public void setGe0018fFecciecurso(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fFecciecurso,ge0018fFecciecurso.length);
   	
   }
   
     /**
	 * 	Update Ge0018fFecciecurso 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFecciecurso(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fFecciecurso+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ge0018fFecciecurso with another Field
	 *	@param value
	 */
   public void setGe0018fFecciecurso(Field source) {
       replace(source,0,source.length(),beginGe0018fFecciecurso,GE_0018F_FECCIECURSO_LEN);
   	
   }  
   
     /**
	 * 	Update Ge0018fFecciecurso 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGe0018fFecciecurso(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGe0018fFecciecurso,GE_0018F_FECCIECURSO_LEN);
   	
   }
   
     /**
	 * 	Update Ge0018fFecciecurso 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGe0018fFecciecurso(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGe0018fFecciecurso+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ge0018f
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setGe0018fCodentid(CONSTANTS.SPACE_2);
         setGe0018fTipproduct(CONSTANTS.SPACE_3);
                     setGe0018fCodcontrat(0);
                     setGe0018fOfigestora(0);
         setGe0018fIdepsig(CONSTANTS.SPACE_12);
                     setGe0018fNumpersona(0);
                     setGe0018fNumcartera(0);
         setGe0018fCodcartera(CONSTANTS.SPACE_8);
         setGe0018fFechaalta(CONSTANTS.SPACE_10);
         setGe0018fFechabaja(CONSTANTS.SPACE_10);
         setGe0018fCodnodo(CONSTANTS.SPACE_8);
         setGe0018fResambito(CONSTANTS.SPACE_12);
                     setGe0018fNumresamb(0);
                     setGe0018fNumpresamb(0);
         setGe0018fCengescapt(CONSTANTS.SPACE_8);
                     setGe0018fNumgescap(0);
                     setGe0018fNumpgescap(0);
                     setGe0018fNumpesprie(0);
         setGe0018fCodcarrie(CONSTANTS.SPACE_8);
         setGe0018fFecciecurso(CONSTANTS.SPACE_10);
   }

		public static int getGe0018fFieldLength() {
			return GE_0018F_LENGTH;
		}

}
  
