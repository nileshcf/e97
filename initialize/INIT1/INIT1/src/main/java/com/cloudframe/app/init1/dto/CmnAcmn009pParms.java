package com.cloudframe.app.init1.dto;

/**
*  The class CmnAcmn009pParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnAcmn009pParms extends CmnAcmn009pParmsSerialized {
   
				private CmnPgmArea cmnPgmArea = new CmnPgmArea();
				private Dfhcommarea10 dfhcommarea10 = new Dfhcommarea10();
				private Dfhcommarea11 dfhcommarea11 = new Dfhcommarea11();
				private Dfhcommarea12 dfhcommarea12 = new Dfhcommarea12();
				private Dfhcommarea13 dfhcommarea13 = new Dfhcommarea13();
				private Dfhcommarea14 dfhcommarea14 = new Dfhcommarea14();
				private Dfhcommarea15 dfhcommarea15 = new Dfhcommarea15();
				private Dfhcommarea16 dfhcommarea16 = new Dfhcommarea16();
				private Dfhcommarea17 dfhcommarea17 = new Dfhcommarea17();
	
	/**
	* Constructor for CmnAcmn009pParms
	**/
    public CmnAcmn009pParms() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			cmnPgmArea.setParent(this,getStartOffset() + 0);
	       			dfhcommarea10.setParent(this,getStartOffset() + 1024);
	       			dfhcommarea11.setParent(this,getStartOffset() + 1024);
	       			dfhcommarea12.setParent(this,getStartOffset() + 1024);
	       			dfhcommarea13.setParent(this,getStartOffset() + 1024);
	       			dfhcommarea14.setParent(this,getStartOffset() + 1024);
	       			dfhcommarea15.setParent(this,getStartOffset() + 1024);
	       			dfhcommarea16.setParent(this,getStartOffset() + 1024);
	       			dfhcommarea17.setParent(this,getStartOffset() + 1024);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of cmnPgmArea
	 *	@return cmnPgmArea
	 */   
	 public CmnPgmArea getCmnPgmArea() {
   	return cmnPgmArea;
   }
   /**
	* 	Update CmnPgmArea with the passed value
	*   Corresponding COBOL Variable is CMN-PGM-AREA
	*	@param value
	*/
   public void setCmnPgmArea(char[] value) {
      cmnPgmArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnPgmArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnPgmArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPgmArea.begin,cmnPgmArea.length());
   }
   
     /**
	 * 	Update CmnPgmArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnPgmArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPgmArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnPgmArea with another Field
	 *	@param value
	 */
   public void setCmnPgmArea(Field source) {
   	replace(source,0,source.length(),cmnPgmArea.begin,cmnPgmArea.length());
   }  
   
     /**
	 * 	Update CmnPgmArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnPgmArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPgmArea.begin,cmnPgmArea.length());
   }
   
     /**
	 * 	Update CmnPgmArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnPgmArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPgmArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dfhcommarea10
	 *	@return dfhcommarea10
	 */   
	 public Dfhcommarea10 getDfhcommarea10() {
   	return dfhcommarea10;
   }
   /**
	* 	Update Dfhcommarea10 with the passed value
	*   Corresponding COBOL Variable is DFHCOMMAREA-10
	*	@param value
	*/
   public void setDfhcommarea10(char[] value) {
      dfhcommarea10.setString(value); 
   }   
    
     /**
	 * 	Update Dfhcommarea10 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea10(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea10.begin,dfhcommarea10.length());
   }
   
     /**
	 * 	Update Dfhcommarea10 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea10.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dfhcommarea10 with another Field
	 *	@param value
	 */
   public void setDfhcommarea10(Field source) {
   	replace(source,0,source.length(),dfhcommarea10.begin,dfhcommarea10.length());
   }  
   
     /**
	 * 	Update Dfhcommarea10 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea10(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea10.begin,dfhcommarea10.length());
   }
   
     /**
	 * 	Update Dfhcommarea10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea10.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dfhcommarea11
	 *	@return dfhcommarea11
	 */   
	 public Dfhcommarea11 getDfhcommarea11() {
   	return dfhcommarea11;
   }
   /**
	* 	Update Dfhcommarea11 with the passed value
	*   Corresponding COBOL Variable is DFHCOMMAREA-11
	*	@param value
	*/
   public void setDfhcommarea11(char[] value) {
      dfhcommarea11.setString(value); 
   }   
    
     /**
	 * 	Update Dfhcommarea11 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea11(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea11.begin,dfhcommarea11.length());
   }
   
     /**
	 * 	Update Dfhcommarea11 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea11.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dfhcommarea11 with another Field
	 *	@param value
	 */
   public void setDfhcommarea11(Field source) {
   	replace(source,0,source.length(),dfhcommarea11.begin,dfhcommarea11.length());
   }  
   
     /**
	 * 	Update Dfhcommarea11 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea11(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea11.begin,dfhcommarea11.length());
   }
   
     /**
	 * 	Update Dfhcommarea11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea11.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dfhcommarea12
	 *	@return dfhcommarea12
	 */   
	 public Dfhcommarea12 getDfhcommarea12() {
   	return dfhcommarea12;
   }
   /**
	* 	Update Dfhcommarea12 with the passed value
	*   Corresponding COBOL Variable is DFHCOMMAREA-12
	*	@param value
	*/
   public void setDfhcommarea12(char[] value) {
      dfhcommarea12.setString(value); 
   }   
    
     /**
	 * 	Update Dfhcommarea12 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea12(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea12.begin,dfhcommarea12.length());
   }
   
     /**
	 * 	Update Dfhcommarea12 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea12.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dfhcommarea12 with another Field
	 *	@param value
	 */
   public void setDfhcommarea12(Field source) {
   	replace(source,0,source.length(),dfhcommarea12.begin,dfhcommarea12.length());
   }  
   
     /**
	 * 	Update Dfhcommarea12 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea12(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea12.begin,dfhcommarea12.length());
   }
   
     /**
	 * 	Update Dfhcommarea12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea12.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dfhcommarea13
	 *	@return dfhcommarea13
	 */   
	 public Dfhcommarea13 getDfhcommarea13() {
   	return dfhcommarea13;
   }
   /**
	* 	Update Dfhcommarea13 with the passed value
	*   Corresponding COBOL Variable is DFHCOMMAREA-13
	*	@param value
	*/
   public void setDfhcommarea13(char[] value) {
      dfhcommarea13.setString(value); 
   }   
    
     /**
	 * 	Update Dfhcommarea13 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea13(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea13.begin,dfhcommarea13.length());
   }
   
     /**
	 * 	Update Dfhcommarea13 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea13.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dfhcommarea13 with another Field
	 *	@param value
	 */
   public void setDfhcommarea13(Field source) {
   	replace(source,0,source.length(),dfhcommarea13.begin,dfhcommarea13.length());
   }  
   
     /**
	 * 	Update Dfhcommarea13 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea13(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea13.begin,dfhcommarea13.length());
   }
   
     /**
	 * 	Update Dfhcommarea13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea13.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dfhcommarea14
	 *	@return dfhcommarea14
	 */   
	 public Dfhcommarea14 getDfhcommarea14() {
   	return dfhcommarea14;
   }
   /**
	* 	Update Dfhcommarea14 with the passed value
	*   Corresponding COBOL Variable is DFHCOMMAREA-14
	*	@param value
	*/
   public void setDfhcommarea14(char[] value) {
      dfhcommarea14.setString(value); 
   }   
    
     /**
	 * 	Update Dfhcommarea14 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea14(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea14.begin,dfhcommarea14.length());
   }
   
     /**
	 * 	Update Dfhcommarea14 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea14.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dfhcommarea14 with another Field
	 *	@param value
	 */
   public void setDfhcommarea14(Field source) {
   	replace(source,0,source.length(),dfhcommarea14.begin,dfhcommarea14.length());
   }  
   
     /**
	 * 	Update Dfhcommarea14 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea14(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea14.begin,dfhcommarea14.length());
   }
   
     /**
	 * 	Update Dfhcommarea14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea14.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dfhcommarea15
	 *	@return dfhcommarea15
	 */   
	 public Dfhcommarea15 getDfhcommarea15() {
   	return dfhcommarea15;
   }
   /**
	* 	Update Dfhcommarea15 with the passed value
	*   Corresponding COBOL Variable is DFHCOMMAREA-15
	*	@param value
	*/
   public void setDfhcommarea15(char[] value) {
      dfhcommarea15.setString(value); 
   }   
    
     /**
	 * 	Update Dfhcommarea15 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea15(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea15.begin,dfhcommarea15.length());
   }
   
     /**
	 * 	Update Dfhcommarea15 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea15.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dfhcommarea15 with another Field
	 *	@param value
	 */
   public void setDfhcommarea15(Field source) {
   	replace(source,0,source.length(),dfhcommarea15.begin,dfhcommarea15.length());
   }  
   
     /**
	 * 	Update Dfhcommarea15 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea15(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea15.begin,dfhcommarea15.length());
   }
   
     /**
	 * 	Update Dfhcommarea15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea15.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dfhcommarea16
	 *	@return dfhcommarea16
	 */   
	 public Dfhcommarea16 getDfhcommarea16() {
   	return dfhcommarea16;
   }
   /**
	* 	Update Dfhcommarea16 with the passed value
	*   Corresponding COBOL Variable is DFHCOMMAREA-16
	*	@param value
	*/
   public void setDfhcommarea16(char[] value) {
      dfhcommarea16.setString(value); 
   }   
    
     /**
	 * 	Update Dfhcommarea16 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea16(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea16.begin,dfhcommarea16.length());
   }
   
     /**
	 * 	Update Dfhcommarea16 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea16.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dfhcommarea16 with another Field
	 *	@param value
	 */
   public void setDfhcommarea16(Field source) {
   	replace(source,0,source.length(),dfhcommarea16.begin,dfhcommarea16.length());
   }  
   
     /**
	 * 	Update Dfhcommarea16 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea16(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea16.begin,dfhcommarea16.length());
   }
   
     /**
	 * 	Update Dfhcommarea16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea16.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dfhcommarea17
	 *	@return dfhcommarea17
	 */   
	 public Dfhcommarea17 getDfhcommarea17() {
   	return dfhcommarea17;
   }
   /**
	* 	Update Dfhcommarea17 with the passed value
	*   Corresponding COBOL Variable is DFHCOMMAREA-17
	*	@param value
	*/
   public void setDfhcommarea17(char[] value) {
      dfhcommarea17.setString(value); 
   }   
    
     /**
	 * 	Update Dfhcommarea17 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea17(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea17.begin,dfhcommarea17.length());
   }
   
     /**
	 * 	Update Dfhcommarea17 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea17.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Dfhcommarea17 with another Field
	 *	@param value
	 */
   public void setDfhcommarea17(Field source) {
   	replace(source,0,source.length(),dfhcommarea17.begin,dfhcommarea17.length());
   }  
   
     /**
	 * 	Update Dfhcommarea17 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDfhcommarea17(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea17.begin,dfhcommarea17.length());
   }
   
     /**
	 * 	Update Dfhcommarea17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDfhcommarea17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dfhcommarea17.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes CmnAcmn009pParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          cmnPgmArea.initialize();
     
          dfhcommarea10.initialize();
     
   }

		public static int getCmnAcmn009pParmsFieldLength() {
			return CMN_ACMN_009P_PARMS_LENGTH;
		}

}
  
