package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00911TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00911TableData extends Ip00911TableDataSerialized { 
   

								private long ip00911BsBin;

						private char[] ip00911BsBinBusSrvLvl = Field.fillLowValue(1);

						private char[] ip00911BsBinBusSrvId = Field.fillLowValue(6);

						private char[] ip00911BsBinAccBrand = Field.fillLowValue(3);

								private int ip00911BsBinBsPriority;

						private char[] ip00911BsBinLifecylInd = Field.fillLowValue(1);

								private int ip00911MemberFiller;
				private Ip00911CentralSiteFields ip00911CentralSiteFields = new Ip00911CentralSiteFields();
	
	/**
	* Constructor for Ip00911TableData
	**/
    public Ip00911TableData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00911TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00911TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip00911CentralSiteFields.setParent(this,getStartOffset() + 22);
    } 

	/**
	 *	Returns the value of ip00911BsBin
	 *	@return ip00911BsBin
	 */
	public long getIp00911BsBin() throws CFException {
       if (isIp00911BsBinModified()) { 
           ip00911BsBin = refreshIp00911BsBin();
        }
   		return ip00911BsBin;
	}
	

	
	   
	/**
	 * 	Update Ip00911BsBin with the passed value
	 *  Corresponding COBOL Variable is IP00911-BS-BIN
	 *	@param number
	 */
	public void setIp00911BsBin(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00911BsBin = checkIp00911BsBinMaxLimit(number); 
		serializeIp00911BsBin(ip00911BsBin);
	}
	

	/**
	 * 	Update Ip00911BsBin with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00911BsBin(char[] value) throws CFException {
		 ip00911BsBin = serializeIp00911BsBin(value);
	}
	/**
	 * 	Update Ip00911BsBin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00911BsBinString(char[] value) throws CFException {
		 setIp00911BsBin(value);
	}
	/**
	 *	Returns the value of ip00911BsBinBusSrvLvl
	 *	@return ip00911BsBinBusSrvLvl
	 */
   public char[] getIp00911BsBinBusSrvLvl() throws CFException{
     if (isIp00911BsBinBusSrvLvlModified()) { 
        ip00911BsBinBusSrvLvl = refreshIp00911BsBinBusSrvLvl();
     }
   		return ip00911BsBinBusSrvLvl;
   }

  
	/**
	*  set variable ip00911BsBinBusSrvLvl
	*  Corresponding COBOL Variable is IP00911-BS-BIN-BUS-SRV-LVL
	*  @param value
	**/
   public void setIp00911BsBinBusSrvLvl(char[] value) {
      ip00911BsBinBusSrvLvl = checkIp00911BsBinBusSrvLvlConstraints(value);
      serializeIp00911BsBinBusSrvLvl(ip00911BsBinBusSrvLvl);
   } 

     /**
	 * 	Update Ip00911BsBinBusSrvLvl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00911BsBinBusSrvLvl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00911BsBinBusSrvLvl,ip00911BsBinBusSrvLvl.length);
   	
   }
   
   public void setIp00911BsBinBusSrvLvl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinBusSrvLvl,ip00911BsBinBusSrvLvl.length);
   	
   }
   
     /**
	 * 	Update Ip00911BsBinBusSrvLvl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911BsBinBusSrvLvl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinBusSrvLvl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00911BsBinBusSrvLvl with another Field
	 *	@param value
	 */
   public void setIp00911BsBinBusSrvLvl(Field source) {
       replace(source,0,source.length(),beginIp00911BsBinBusSrvLvl,IP_00911_BS_BIN_BUS_SRV_LVL_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00911BsBinBusSrvLvl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00911BsBinBusSrvLvl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00911BsBinBusSrvLvl,IP_00911_BS_BIN_BUS_SRV_LVL_LEN);
   	
   }
   
     /**
	 * 	Update Ip00911BsBinBusSrvLvl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911BsBinBusSrvLvl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinBusSrvLvl+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00911BsBinBusSrvId
	 *	@return ip00911BsBinBusSrvId
	 */
   public char[] getIp00911BsBinBusSrvId() throws CFException{
     if (isIp00911BsBinBusSrvIdModified()) { 
        ip00911BsBinBusSrvId = refreshIp00911BsBinBusSrvId();
     }
   		return ip00911BsBinBusSrvId;
   }

  
	/**
	*  set variable ip00911BsBinBusSrvId
	*  Corresponding COBOL Variable is IP00911-BS-BIN-BUS-SRV-ID
	*  @param value
	**/
   public void setIp00911BsBinBusSrvId(char[] value) {
      ip00911BsBinBusSrvId = checkIp00911BsBinBusSrvIdConstraints(value);
      serializeIp00911BsBinBusSrvId(ip00911BsBinBusSrvId);
   } 

     /**
	 * 	Update Ip00911BsBinBusSrvId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00911BsBinBusSrvId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00911BsBinBusSrvId,ip00911BsBinBusSrvId.length);
   	
   }
   
   public void setIp00911BsBinBusSrvId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinBusSrvId,ip00911BsBinBusSrvId.length);
   	
   }
   
     /**
	 * 	Update Ip00911BsBinBusSrvId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911BsBinBusSrvId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinBusSrvId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00911BsBinBusSrvId with another Field
	 *	@param value
	 */
   public void setIp00911BsBinBusSrvId(Field source) {
       replace(source,0,source.length(),beginIp00911BsBinBusSrvId,IP_00911_BS_BIN_BUS_SRV_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00911BsBinBusSrvId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00911BsBinBusSrvId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00911BsBinBusSrvId,IP_00911_BS_BIN_BUS_SRV_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip00911BsBinBusSrvId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911BsBinBusSrvId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinBusSrvId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00911BsBinAccBrand
	 *	@return ip00911BsBinAccBrand
	 */
   public char[] getIp00911BsBinAccBrand() throws CFException{
     if (isIp00911BsBinAccBrandModified()) { 
        ip00911BsBinAccBrand = refreshIp00911BsBinAccBrand();
     }
   		return ip00911BsBinAccBrand;
   }

  
	/**
	*  set variable ip00911BsBinAccBrand
	*  Corresponding COBOL Variable is IP00911-BS-BIN-ACC-BRAND
	*  @param value
	**/
   public void setIp00911BsBinAccBrand(char[] value) {
      ip00911BsBinAccBrand = checkIp00911BsBinAccBrandConstraints(value);
      serializeIp00911BsBinAccBrand(ip00911BsBinAccBrand);
   } 

     /**
	 * 	Update Ip00911BsBinAccBrand 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00911BsBinAccBrand(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00911BsBinAccBrand,ip00911BsBinAccBrand.length);
   	
   }
   
   public void setIp00911BsBinAccBrand(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinAccBrand,ip00911BsBinAccBrand.length);
   	
   }
   
     /**
	 * 	Update Ip00911BsBinAccBrand 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911BsBinAccBrand(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinAccBrand+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00911BsBinAccBrand with another Field
	 *	@param value
	 */
   public void setIp00911BsBinAccBrand(Field source) {
       replace(source,0,source.length(),beginIp00911BsBinAccBrand,IP_00911_BS_BIN_ACC_BRAND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00911BsBinAccBrand 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00911BsBinAccBrand(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00911BsBinAccBrand,IP_00911_BS_BIN_ACC_BRAND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00911BsBinAccBrand 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911BsBinAccBrand(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinAccBrand+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00911BsBinBsPriority
	 *	@return ip00911BsBinBsPriority
	 */
	public int getIp00911BsBinBsPriority() throws CFException {
       if (isIp00911BsBinBsPriorityModified()) { 
           ip00911BsBinBsPriority = refreshIp00911BsBinBsPriority();
        }
   		return ip00911BsBinBsPriority;
	}
	

	
	   
	/**
	 * 	Update Ip00911BsBinBsPriority with the passed value
	 *  Corresponding COBOL Variable is IP00911-BS-BIN-BS-PRIORITY
	 *	@param number
	 */
	public void setIp00911BsBinBsPriority(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00911BsBinBsPriority = checkIp00911BsBinBsPriorityMaxLimit(number); 
		serializeIp00911BsBinBsPriority(ip00911BsBinBsPriority);
	}
	

	public void setIp00911BsBinBsPriority(long number) {
	    number = checkIp00911BsBinBsPriorityMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00911BsBinBsPriority((int)number);
	}
	
	/**
	 * 	Update Ip00911BsBinBsPriority with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00911BsBinBsPriority(char[] value) throws CFException {
		 ip00911BsBinBsPriority = serializeIp00911BsBinBsPriority(value);
	}
	/**
	 * 	Update Ip00911BsBinBsPriority with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00911BsBinBsPriorityString(char[] value) throws CFException {
		 setIp00911BsBinBsPriority(value);
	}
	/**
	 *	Returns the value of ip00911BsBinLifecylInd
	 *	@return ip00911BsBinLifecylInd
	 */
   public char[] getIp00911BsBinLifecylInd() throws CFException{
     if (isIp00911BsBinLifecylIndModified()) { 
        ip00911BsBinLifecylInd = refreshIp00911BsBinLifecylInd();
     }
   		return ip00911BsBinLifecylInd;
   }

  
	/**
	*  set variable ip00911BsBinLifecylInd
	*  Corresponding COBOL Variable is IP00911-BS-BIN-LIFECYL-IND
	*  @param value
	**/
   public void setIp00911BsBinLifecylInd(char[] value) {
      ip00911BsBinLifecylInd = checkIp00911BsBinLifecylIndConstraints(value);
      serializeIp00911BsBinLifecylInd(ip00911BsBinLifecylInd);
   } 

     /**
	 * 	Update Ip00911BsBinLifecylInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00911BsBinLifecylInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00911BsBinLifecylInd,ip00911BsBinLifecylInd.length);
   	
   }
   
   public void setIp00911BsBinLifecylInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinLifecylInd,ip00911BsBinLifecylInd.length);
   	
   }
   
     /**
	 * 	Update Ip00911BsBinLifecylInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911BsBinLifecylInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinLifecylInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00911BsBinLifecylInd with another Field
	 *	@param value
	 */
   public void setIp00911BsBinLifecylInd(Field source) {
       replace(source,0,source.length(),beginIp00911BsBinLifecylInd,IP_00911_BS_BIN_LIFECYL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00911BsBinLifecylInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00911BsBinLifecylInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00911BsBinLifecylInd,IP_00911_BS_BIN_LIFECYL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00911BsBinLifecylInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911BsBinLifecylInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00911BsBinLifecylInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00911MemberFiller
	 *	@return ip00911MemberFiller
	 */
	public int getIp00911MemberFiller() throws CFException {
       if (isIp00911MemberFillerModified()) { 
           ip00911MemberFiller = refreshIp00911MemberFiller();
        }
   		return ip00911MemberFiller;
	}
	

	
	   
	/**
	 * 	Update Ip00911MemberFiller with the passed value
	 *  Corresponding COBOL Variable is IP00911-MEMBER-FILLER
	 *	@param number
	 */
	public void setIp00911MemberFiller(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00911MemberFiller = checkIp00911MemberFillerMaxLimit(number); 
		serializeIp00911MemberFiller(ip00911MemberFiller);
	}
	

	public void setIp00911MemberFiller(long number) {
	    number = checkIp00911MemberFillerMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00911MemberFiller((int)number);
	}
	
	/**
	 * 	Update Ip00911MemberFiller with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00911MemberFiller(char[] value) throws CFException {
		 ip00911MemberFiller = serializeIp00911MemberFiller(value);
	}
	/**
	 * 	Update Ip00911MemberFiller with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00911MemberFillerString(char[] value) throws CFException {
		 setIp00911MemberFiller(value);
	}
	/**
	 *	Returns the value of ip00911CentralSiteFields
	 *	@return ip00911CentralSiteFields
	 */   
	 public Ip00911CentralSiteFields getIp00911CentralSiteFields() {
   	return ip00911CentralSiteFields;
   }
   /**
	* 	Update Ip00911CentralSiteFields with the passed value
	*   Corresponding COBOL Variable is IP00911-CENTRAL-SITE-FIELDS
	*	@param value
	*/
   public void setIp00911CentralSiteFields(char[] value) {
      ip00911CentralSiteFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip00911CentralSiteFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00911CentralSiteFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00911CentralSiteFields.begin,ip00911CentralSiteFields.length());
   }
   
     /**
	 * 	Update Ip00911CentralSiteFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911CentralSiteFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00911CentralSiteFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00911CentralSiteFields with another Field
	 *	@param value
	 */
   public void setIp00911CentralSiteFields(Field source) {
   	replace(source,0,source.length(),ip00911CentralSiteFields.begin,ip00911CentralSiteFields.length());
   }  
   
     /**
	 * 	Update Ip00911CentralSiteFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00911CentralSiteFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00911CentralSiteFields.begin,ip00911CentralSiteFields.length());
   }
   
     /**
	 * 	Update Ip00911CentralSiteFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911CentralSiteFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00911CentralSiteFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip00911TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00911BsBin(0);
         setIp00911BsBinBusSrvLvl(CONSTANTS.SPACE);
         setIp00911BsBinBusSrvId(CONSTANTS.SPACE_6);
         setIp00911BsBinAccBrand(CONSTANTS.SPACE_3);
                     setIp00911BsBinBsPriority(0);
         setIp00911BsBinLifecylInd(CONSTANTS.SPACE);
                     setIp00911MemberFiller(0);
          ip00911CentralSiteFields.initialize();
     
   }

		public static int getIp00911TableDataFieldLength() {
			return IP_00911_TABLE_DATA_LENGTH;
		}

}
  
