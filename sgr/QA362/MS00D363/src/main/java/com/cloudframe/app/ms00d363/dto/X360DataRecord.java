package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360DataRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360DataRecord extends X360DataRecordSerialized { 
   
				private X360SrtKey x360SrtKey = new X360SrtKey();
				private X360OtherDataFields x360OtherDataFields = new X360OtherDataFields();
				private X360Financials x360Financials = new X360Financials();
				private X360Adjustments x360Adjustments = new X360Adjustments();
				private X360MbrRptKey x360MbrRptKey = new X360MbrRptKey();
				private X360AAcqA09DeniedCnt x360AAcqA09DeniedCnt = new X360AAcqA09DeniedCnt();
				private X360AIssA09DeniedCnt x360AIssA09DeniedCnt = new X360AIssA09DeniedCnt();
				private X360ExtPrecisionInfo x360ExtPrecisionInfo = new X360ExtPrecisionInfo();
				private X360FAcqSurchrgPos x360FAcqSurchrgPos = new X360FAcqSurchrgPos();
				private X360FIssSurchrgPos x360FIssSurchrgPos = new X360FIssSurchrgPos();
				private X360AAcqA15ApprovedCnt x360AAcqA15ApprovedCnt = new X360AAcqA15ApprovedCnt();
				private X360AIssA15ApprovedCnt x360AIssA15ApprovedCnt = new X360AIssA15ApprovedCnt();
				private X360FAcqSurchrgRvPos x360FAcqSurchrgRvPos = new X360FAcqSurchrgRvPos();
				private X360FIssSurchrgRvPos x360FIssSurchrgRvPos = new X360FIssSurchrgRvPos();
				private X360FAcqSurchrgRvAtm x360FAcqSurchrgRvAtm = new X360FAcqSurchrgRvAtm();
				private X360FIssSurchrgRvAtm x360FIssSurchrgRvAtm = new X360FIssSurchrgRvAtm();

						private char[] x360FBatchIchngSw = Field.fillLowValue(1);
				private X360FAcqIfeeAmt x360FAcqIfeeAmt = new X360FAcqIfeeAmt();
				private X360FIssIfeeAmt x360FIssIfeeAmt = new X360FIssIfeeAmt();

	
	/**
	* Constructor for X360DataRecord
	**/
    public X360DataRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360DataRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360DataRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			x360SrtKey.setParent(this,getStartOffset() + 0);
	       			x360OtherDataFields.setParent(this,getStartOffset() + 94);
	       			x360Financials.setParent(this,getStartOffset() + 218);
	       			x360Adjustments.setParent(this,getStartOffset() + 582);
	       			x360MbrRptKey.setParent(this,getStartOffset() + 999);
	       			x360AAcqA09DeniedCnt.setParent(this,getStartOffset() + 1071);
	       			x360AIssA09DeniedCnt.setParent(this,getStartOffset() + 1071);
	       			x360ExtPrecisionInfo.setParent(this,getStartOffset() + 1081);
	       			x360FAcqSurchrgPos.setParent(this,getStartOffset() + 1143);
	       			x360FIssSurchrgPos.setParent(this,getStartOffset() + 1143);
	       			x360AAcqA15ApprovedCnt.setParent(this,getStartOffset() + 1169);
	       			x360AIssA15ApprovedCnt.setParent(this,getStartOffset() + 1169);
	       			x360FAcqSurchrgRvPos.setParent(this,getStartOffset() + 1179);
	       			x360FIssSurchrgRvPos.setParent(this,getStartOffset() + 1179);
	       			x360FAcqSurchrgRvAtm.setParent(this,getStartOffset() + 1205);
	       			x360FIssSurchrgRvAtm.setParent(this,getStartOffset() + 1205);
	       			x360FAcqIfeeAmt.setParent(this,getStartOffset() + 1232);
	       			x360FIssIfeeAmt.setParent(this,getStartOffset() + 1232);
    } 

	/**
	 *	Returns the value of x360SrtKey
	 *	@return x360SrtKey
	 */   
	 public X360SrtKey getX360SrtKey() {
   	return x360SrtKey;
   }
   /**
	* 	Update X360SrtKey with the passed value
	*   Corresponding COBOL Variable is X360-SRT-KEY
	*	@param value
	*/
   public void setX360SrtKey(char[] value) {
      x360SrtKey.setString(value); 
   }   
    
     /**
	 * 	Update X360SrtKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360SrtKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360SrtKey.begin,x360SrtKey.length());
   }
   
     /**
	 * 	Update X360SrtKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360SrtKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360SrtKey with another Field
	 *	@param value
	 */
   public void setX360SrtKey(Field source) {
   	replace(source,0,source.length(),x360SrtKey.begin,x360SrtKey.length());
   }  
   
     /**
	 * 	Update X360SrtKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360SrtKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360SrtKey.begin,x360SrtKey.length());
   }
   
     /**
	 * 	Update X360SrtKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360SrtKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360OtherDataFields
	 *	@return x360OtherDataFields
	 */   
	 public X360OtherDataFields getX360OtherDataFields() {
   	return x360OtherDataFields;
   }
   /**
	* 	Update X360OtherDataFields with the passed value
	*   Corresponding COBOL Variable is X360-OTHER-DATA-FIELDS
	*	@param value
	*/
   public void setX360OtherDataFields(char[] value) {
      x360OtherDataFields.setString(value); 
   }   
    
     /**
	 * 	Update X360OtherDataFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360OtherDataFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360OtherDataFields.begin,x360OtherDataFields.length());
   }
   
     /**
	 * 	Update X360OtherDataFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360OtherDataFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360OtherDataFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360OtherDataFields with another Field
	 *	@param value
	 */
   public void setX360OtherDataFields(Field source) {
   	replace(source,0,source.length(),x360OtherDataFields.begin,x360OtherDataFields.length());
   }  
   
     /**
	 * 	Update X360OtherDataFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360OtherDataFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360OtherDataFields.begin,x360OtherDataFields.length());
   }
   
     /**
	 * 	Update X360OtherDataFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360OtherDataFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360OtherDataFields.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360Financials
	 *	@return x360Financials
	 */   
	 public X360Financials getX360Financials() {
   	return x360Financials;
   }
   /**
	* 	Update X360Financials with the passed value
	*   Corresponding COBOL Variable is X360-FINANCIALS
	*	@param value
	*/
   public void setX360Financials(char[] value) {
      x360Financials.setString(value); 
   }   
    
     /**
	 * 	Update X360Financials 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360Financials(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360Financials.begin,x360Financials.length());
   }
   
     /**
	 * 	Update X360Financials 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360Financials(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360Financials.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360Financials with another Field
	 *	@param value
	 */
   public void setX360Financials(Field source) {
   	replace(source,0,source.length(),x360Financials.begin,x360Financials.length());
   }  
   
     /**
	 * 	Update X360Financials 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360Financials(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360Financials.begin,x360Financials.length());
   }
   
     /**
	 * 	Update X360Financials 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360Financials(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360Financials.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360Adjustments
	 *	@return x360Adjustments
	 */   
	 public X360Adjustments getX360Adjustments() {
   	return x360Adjustments;
   }
   /**
	* 	Update X360Adjustments with the passed value
	*   Corresponding COBOL Variable is X360-ADJUSTMENTS
	*	@param value
	*/
   public void setX360Adjustments(char[] value) {
      x360Adjustments.setString(value); 
   }   
    
     /**
	 * 	Update X360Adjustments 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360Adjustments(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360Adjustments.begin,x360Adjustments.length());
   }
   
     /**
	 * 	Update X360Adjustments 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360Adjustments(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360Adjustments.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360Adjustments with another Field
	 *	@param value
	 */
   public void setX360Adjustments(Field source) {
   	replace(source,0,source.length(),x360Adjustments.begin,x360Adjustments.length());
   }  
   
     /**
	 * 	Update X360Adjustments 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360Adjustments(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360Adjustments.begin,x360Adjustments.length());
   }
   
     /**
	 * 	Update X360Adjustments 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360Adjustments(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360Adjustments.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360MbrRptKey
	 *	@return x360MbrRptKey
	 */   
	 public X360MbrRptKey getX360MbrRptKey() {
   	return x360MbrRptKey;
   }
   /**
	* 	Update X360MbrRptKey with the passed value
	*   Corresponding COBOL Variable is X360-MBR-RPT-KEY
	*	@param value
	*/
   public void setX360MbrRptKey(char[] value) {
      x360MbrRptKey.setString(value); 
   }   
    
     /**
	 * 	Update X360MbrRptKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360MbrRptKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360MbrRptKey.begin,x360MbrRptKey.length());
   }
   
     /**
	 * 	Update X360MbrRptKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360MbrRptKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360MbrRptKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360MbrRptKey with another Field
	 *	@param value
	 */
   public void setX360MbrRptKey(Field source) {
   	replace(source,0,source.length(),x360MbrRptKey.begin,x360MbrRptKey.length());
   }  
   
     /**
	 * 	Update X360MbrRptKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360MbrRptKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360MbrRptKey.begin,x360MbrRptKey.length());
   }
   
     /**
	 * 	Update X360MbrRptKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360MbrRptKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360MbrRptKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360AAcqA09DeniedCnt
	 *	@return x360AAcqA09DeniedCnt
	 */   
	 public X360AAcqA09DeniedCnt getX360AAcqA09DeniedCnt() {
   	return x360AAcqA09DeniedCnt;
   }
   /**
	* 	Update X360AAcqA09DeniedCnt with the passed value
	*   Corresponding COBOL Variable is X360-A-ACQ-A09-DENIED-CNT
	*	@param value
	*/
   public void setX360AAcqA09DeniedCnt(char[] value) {
      x360AAcqA09DeniedCnt.setString(value); 
   }   
    
     /**
	 * 	Update X360AAcqA09DeniedCnt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360AAcqA09DeniedCnt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AAcqA09DeniedCnt.begin,x360AAcqA09DeniedCnt.length());
   }
   
     /**
	 * 	Update X360AAcqA09DeniedCnt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360AAcqA09DeniedCnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AAcqA09DeniedCnt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360AAcqA09DeniedCnt with another Field
	 *	@param value
	 */
   public void setX360AAcqA09DeniedCnt(Field source) {
   	replace(source,0,source.length(),x360AAcqA09DeniedCnt.begin,x360AAcqA09DeniedCnt.length());
   }  
   
     /**
	 * 	Update X360AAcqA09DeniedCnt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360AAcqA09DeniedCnt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AAcqA09DeniedCnt.begin,x360AAcqA09DeniedCnt.length());
   }
   
     /**
	 * 	Update X360AAcqA09DeniedCnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360AAcqA09DeniedCnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AAcqA09DeniedCnt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360AIssA09DeniedCnt
	 *	@return x360AIssA09DeniedCnt
	 */   
	 public X360AIssA09DeniedCnt getX360AIssA09DeniedCnt() {
   	return x360AIssA09DeniedCnt;
   }
   /**
	* 	Update X360AIssA09DeniedCnt with the passed value
	*   Corresponding COBOL Variable is X360-A-ISS-A09-DENIED-CNT
	*	@param value
	*/
   public void setX360AIssA09DeniedCnt(char[] value) {
      x360AIssA09DeniedCnt.setString(value); 
   }   
    
     /**
	 * 	Update X360AIssA09DeniedCnt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360AIssA09DeniedCnt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AIssA09DeniedCnt.begin,x360AIssA09DeniedCnt.length());
   }
   
     /**
	 * 	Update X360AIssA09DeniedCnt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360AIssA09DeniedCnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AIssA09DeniedCnt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360AIssA09DeniedCnt with another Field
	 *	@param value
	 */
   public void setX360AIssA09DeniedCnt(Field source) {
   	replace(source,0,source.length(),x360AIssA09DeniedCnt.begin,x360AIssA09DeniedCnt.length());
   }  
   
     /**
	 * 	Update X360AIssA09DeniedCnt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360AIssA09DeniedCnt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AIssA09DeniedCnt.begin,x360AIssA09DeniedCnt.length());
   }
   
     /**
	 * 	Update X360AIssA09DeniedCnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360AIssA09DeniedCnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AIssA09DeniedCnt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360ExtPrecisionInfo
	 *	@return x360ExtPrecisionInfo
	 */   
	 public X360ExtPrecisionInfo getX360ExtPrecisionInfo() {
   	return x360ExtPrecisionInfo;
   }
   /**
	* 	Update X360ExtPrecisionInfo with the passed value
	*   Corresponding COBOL Variable is X360-EXT-PRECISION-INFO
	*	@param value
	*/
   public void setX360ExtPrecisionInfo(char[] value) {
      x360ExtPrecisionInfo.setString(value); 
   }   
    
     /**
	 * 	Update X360ExtPrecisionInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360ExtPrecisionInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360ExtPrecisionInfo.begin,x360ExtPrecisionInfo.length());
   }
   
     /**
	 * 	Update X360ExtPrecisionInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360ExtPrecisionInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360ExtPrecisionInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360ExtPrecisionInfo with another Field
	 *	@param value
	 */
   public void setX360ExtPrecisionInfo(Field source) {
   	replace(source,0,source.length(),x360ExtPrecisionInfo.begin,x360ExtPrecisionInfo.length());
   }  
   
     /**
	 * 	Update X360ExtPrecisionInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360ExtPrecisionInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360ExtPrecisionInfo.begin,x360ExtPrecisionInfo.length());
   }
   
     /**
	 * 	Update X360ExtPrecisionInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360ExtPrecisionInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360ExtPrecisionInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FAcqSurchrgPos
	 *	@return x360FAcqSurchrgPos
	 */   
	 public X360FAcqSurchrgPos getX360FAcqSurchrgPos() {
   	return x360FAcqSurchrgPos;
   }
   /**
	* 	Update X360FAcqSurchrgPos with the passed value
	*   Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-POS
	*	@param value
	*/
   public void setX360FAcqSurchrgPos(char[] value) {
      x360FAcqSurchrgPos.setString(value); 
   }   
    
     /**
	 * 	Update X360FAcqSurchrgPos 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FAcqSurchrgPos(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgPos.begin,x360FAcqSurchrgPos.length());
   }
   
     /**
	 * 	Update X360FAcqSurchrgPos 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FAcqSurchrgPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgPos.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FAcqSurchrgPos with another Field
	 *	@param value
	 */
   public void setX360FAcqSurchrgPos(Field source) {
   	replace(source,0,source.length(),x360FAcqSurchrgPos.begin,x360FAcqSurchrgPos.length());
   }  
   
     /**
	 * 	Update X360FAcqSurchrgPos 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FAcqSurchrgPos(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgPos.begin,x360FAcqSurchrgPos.length());
   }
   
     /**
	 * 	Update X360FAcqSurchrgPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FAcqSurchrgPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgPos.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FIssSurchrgPos
	 *	@return x360FIssSurchrgPos
	 */   
	 public X360FIssSurchrgPos getX360FIssSurchrgPos() {
   	return x360FIssSurchrgPos;
   }
   /**
	* 	Update X360FIssSurchrgPos with the passed value
	*   Corresponding COBOL Variable is X360-F-ISS-SURCHRG-POS
	*	@param value
	*/
   public void setX360FIssSurchrgPos(char[] value) {
      x360FIssSurchrgPos.setString(value); 
   }   
    
     /**
	 * 	Update X360FIssSurchrgPos 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FIssSurchrgPos(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgPos.begin,x360FIssSurchrgPos.length());
   }
   
     /**
	 * 	Update X360FIssSurchrgPos 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FIssSurchrgPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgPos.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FIssSurchrgPos with another Field
	 *	@param value
	 */
   public void setX360FIssSurchrgPos(Field source) {
   	replace(source,0,source.length(),x360FIssSurchrgPos.begin,x360FIssSurchrgPos.length());
   }  
   
     /**
	 * 	Update X360FIssSurchrgPos 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FIssSurchrgPos(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgPos.begin,x360FIssSurchrgPos.length());
   }
   
     /**
	 * 	Update X360FIssSurchrgPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FIssSurchrgPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgPos.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360AAcqA15ApprovedCnt
	 *	@return x360AAcqA15ApprovedCnt
	 */   
	 public X360AAcqA15ApprovedCnt getX360AAcqA15ApprovedCnt() {
   	return x360AAcqA15ApprovedCnt;
   }
   /**
	* 	Update X360AAcqA15ApprovedCnt with the passed value
	*   Corresponding COBOL Variable is X360-A-ACQ-A15-APPROVED-CNT
	*	@param value
	*/
   public void setX360AAcqA15ApprovedCnt(char[] value) {
      x360AAcqA15ApprovedCnt.setString(value); 
   }   
    
     /**
	 * 	Update X360AAcqA15ApprovedCnt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360AAcqA15ApprovedCnt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AAcqA15ApprovedCnt.begin,x360AAcqA15ApprovedCnt.length());
   }
   
     /**
	 * 	Update X360AAcqA15ApprovedCnt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360AAcqA15ApprovedCnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AAcqA15ApprovedCnt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360AAcqA15ApprovedCnt with another Field
	 *	@param value
	 */
   public void setX360AAcqA15ApprovedCnt(Field source) {
   	replace(source,0,source.length(),x360AAcqA15ApprovedCnt.begin,x360AAcqA15ApprovedCnt.length());
   }  
   
     /**
	 * 	Update X360AAcqA15ApprovedCnt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360AAcqA15ApprovedCnt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AAcqA15ApprovedCnt.begin,x360AAcqA15ApprovedCnt.length());
   }
   
     /**
	 * 	Update X360AAcqA15ApprovedCnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360AAcqA15ApprovedCnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AAcqA15ApprovedCnt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360AIssA15ApprovedCnt
	 *	@return x360AIssA15ApprovedCnt
	 */   
	 public X360AIssA15ApprovedCnt getX360AIssA15ApprovedCnt() {
   	return x360AIssA15ApprovedCnt;
   }
   /**
	* 	Update X360AIssA15ApprovedCnt with the passed value
	*   Corresponding COBOL Variable is X360-A-ISS-A15-APPROVED-CNT
	*	@param value
	*/
   public void setX360AIssA15ApprovedCnt(char[] value) {
      x360AIssA15ApprovedCnt.setString(value); 
   }   
    
     /**
	 * 	Update X360AIssA15ApprovedCnt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360AIssA15ApprovedCnt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AIssA15ApprovedCnt.begin,x360AIssA15ApprovedCnt.length());
   }
   
     /**
	 * 	Update X360AIssA15ApprovedCnt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360AIssA15ApprovedCnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AIssA15ApprovedCnt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360AIssA15ApprovedCnt with another Field
	 *	@param value
	 */
   public void setX360AIssA15ApprovedCnt(Field source) {
   	replace(source,0,source.length(),x360AIssA15ApprovedCnt.begin,x360AIssA15ApprovedCnt.length());
   }  
   
     /**
	 * 	Update X360AIssA15ApprovedCnt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360AIssA15ApprovedCnt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AIssA15ApprovedCnt.begin,x360AIssA15ApprovedCnt.length());
   }
   
     /**
	 * 	Update X360AIssA15ApprovedCnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360AIssA15ApprovedCnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AIssA15ApprovedCnt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FAcqSurchrgRvPos
	 *	@return x360FAcqSurchrgRvPos
	 */   
	 public X360FAcqSurchrgRvPos getX360FAcqSurchrgRvPos() {
   	return x360FAcqSurchrgRvPos;
   }
   /**
	* 	Update X360FAcqSurchrgRvPos with the passed value
	*   Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-RV-POS
	*	@param value
	*/
   public void setX360FAcqSurchrgRvPos(char[] value) {
      x360FAcqSurchrgRvPos.setString(value); 
   }   
    
     /**
	 * 	Update X360FAcqSurchrgRvPos 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FAcqSurchrgRvPos(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgRvPos.begin,x360FAcqSurchrgRvPos.length());
   }
   
     /**
	 * 	Update X360FAcqSurchrgRvPos 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FAcqSurchrgRvPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgRvPos.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FAcqSurchrgRvPos with another Field
	 *	@param value
	 */
   public void setX360FAcqSurchrgRvPos(Field source) {
   	replace(source,0,source.length(),x360FAcqSurchrgRvPos.begin,x360FAcqSurchrgRvPos.length());
   }  
   
     /**
	 * 	Update X360FAcqSurchrgRvPos 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FAcqSurchrgRvPos(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgRvPos.begin,x360FAcqSurchrgRvPos.length());
   }
   
     /**
	 * 	Update X360FAcqSurchrgRvPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FAcqSurchrgRvPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgRvPos.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FIssSurchrgRvPos
	 *	@return x360FIssSurchrgRvPos
	 */   
	 public X360FIssSurchrgRvPos getX360FIssSurchrgRvPos() {
   	return x360FIssSurchrgRvPos;
   }
   /**
	* 	Update X360FIssSurchrgRvPos with the passed value
	*   Corresponding COBOL Variable is X360-F-ISS-SURCHRG-RV-POS
	*	@param value
	*/
   public void setX360FIssSurchrgRvPos(char[] value) {
      x360FIssSurchrgRvPos.setString(value); 
   }   
    
     /**
	 * 	Update X360FIssSurchrgRvPos 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FIssSurchrgRvPos(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgRvPos.begin,x360FIssSurchrgRvPos.length());
   }
   
     /**
	 * 	Update X360FIssSurchrgRvPos 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FIssSurchrgRvPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgRvPos.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FIssSurchrgRvPos with another Field
	 *	@param value
	 */
   public void setX360FIssSurchrgRvPos(Field source) {
   	replace(source,0,source.length(),x360FIssSurchrgRvPos.begin,x360FIssSurchrgRvPos.length());
   }  
   
     /**
	 * 	Update X360FIssSurchrgRvPos 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FIssSurchrgRvPos(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgRvPos.begin,x360FIssSurchrgRvPos.length());
   }
   
     /**
	 * 	Update X360FIssSurchrgRvPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FIssSurchrgRvPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgRvPos.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FAcqSurchrgRvAtm
	 *	@return x360FAcqSurchrgRvAtm
	 */   
	 public X360FAcqSurchrgRvAtm getX360FAcqSurchrgRvAtm() {
   	return x360FAcqSurchrgRvAtm;
   }
   /**
	* 	Update X360FAcqSurchrgRvAtm with the passed value
	*   Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-RV-ATM
	*	@param value
	*/
   public void setX360FAcqSurchrgRvAtm(char[] value) {
      x360FAcqSurchrgRvAtm.setString(value); 
   }   
    
     /**
	 * 	Update X360FAcqSurchrgRvAtm 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FAcqSurchrgRvAtm(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgRvAtm.begin,x360FAcqSurchrgRvAtm.length());
   }
   
     /**
	 * 	Update X360FAcqSurchrgRvAtm 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FAcqSurchrgRvAtm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgRvAtm.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FAcqSurchrgRvAtm with another Field
	 *	@param value
	 */
   public void setX360FAcqSurchrgRvAtm(Field source) {
   	replace(source,0,source.length(),x360FAcqSurchrgRvAtm.begin,x360FAcqSurchrgRvAtm.length());
   }  
   
     /**
	 * 	Update X360FAcqSurchrgRvAtm 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FAcqSurchrgRvAtm(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgRvAtm.begin,x360FAcqSurchrgRvAtm.length());
   }
   
     /**
	 * 	Update X360FAcqSurchrgRvAtm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FAcqSurchrgRvAtm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqSurchrgRvAtm.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FIssSurchrgRvAtm
	 *	@return x360FIssSurchrgRvAtm
	 */   
	 public X360FIssSurchrgRvAtm getX360FIssSurchrgRvAtm() {
   	return x360FIssSurchrgRvAtm;
   }
   /**
	* 	Update X360FIssSurchrgRvAtm with the passed value
	*   Corresponding COBOL Variable is X360-F-ISS-SURCHRG-RV-ATM
	*	@param value
	*/
   public void setX360FIssSurchrgRvAtm(char[] value) {
      x360FIssSurchrgRvAtm.setString(value); 
   }   
    
     /**
	 * 	Update X360FIssSurchrgRvAtm 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FIssSurchrgRvAtm(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgRvAtm.begin,x360FIssSurchrgRvAtm.length());
   }
   
     /**
	 * 	Update X360FIssSurchrgRvAtm 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FIssSurchrgRvAtm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgRvAtm.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FIssSurchrgRvAtm with another Field
	 *	@param value
	 */
   public void setX360FIssSurchrgRvAtm(Field source) {
   	replace(source,0,source.length(),x360FIssSurchrgRvAtm.begin,x360FIssSurchrgRvAtm.length());
   }  
   
     /**
	 * 	Update X360FIssSurchrgRvAtm 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FIssSurchrgRvAtm(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgRvAtm.begin,x360FIssSurchrgRvAtm.length());
   }
   
     /**
	 * 	Update X360FIssSurchrgRvAtm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FIssSurchrgRvAtm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssSurchrgRvAtm.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FBatchIchngSw
	 *	@return x360FBatchIchngSw
	 */
   public char[] getX360FBatchIchngSw() throws CFException{
     if (isX360FBatchIchngSwModified()) { 
        x360FBatchIchngSw = refreshX360FBatchIchngSw();
     }
   		return x360FBatchIchngSw;
   }

  
	/**
	*  set variable x360FBatchIchngSw
	*  Corresponding COBOL Variable is X360-F-BATCH-ICHNG-SW
	*  @param value
	**/
   public void setX360FBatchIchngSw(char[] value) {
      x360FBatchIchngSw = checkX360FBatchIchngSwConstraints(value);
      serializeX360FBatchIchngSw(x360FBatchIchngSw);
   } 

     /**
	 * 	Update X360FBatchIchngSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360FBatchIchngSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360FBatchIchngSw,x360FBatchIchngSw.length);
   	
   }
   
   public void setX360FBatchIchngSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360FBatchIchngSw,x360FBatchIchngSw.length);
   	
   }
   
     /**
	 * 	Update X360FBatchIchngSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FBatchIchngSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360FBatchIchngSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360FBatchIchngSw with another Field
	 *	@param value
	 */
   public void setX360FBatchIchngSw(Field source) {
       replace(source,0,source.length(),beginX360FBatchIchngSw,X_360_FBATCH_ICHNG_SW_LEN);
   	
   }  
   
     /**
	 * 	Update X360FBatchIchngSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360FBatchIchngSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360FBatchIchngSw,X_360_FBATCH_ICHNG_SW_LEN);
   	
   }
   
     /**
	 * 	Update X360FBatchIchngSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FBatchIchngSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360FBatchIchngSw+targetIndex,targetLen);
    
   }
	char[] x360FBatchFinIfeeUsed88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isX360FBatchFinIfeeUsed()
	 *	@return  Returns true if isX360FBatchFinIfeeUsed() is "1"
	 */
   public boolean isX360FBatchFinIfeeUsed() throws CFException {
      return (  compareChars( getX360FBatchIchngSw() , x360FBatchFinIfeeUsed88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setX360FBatchFinIfeeUsedTrue() {  			
    	setX360FBatchIchngSw( x360FBatchFinIfeeUsed88Value);
   	}
	char[] x360FBatchNfIfeeUsed88Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isX360FBatchNfIfeeUsed()
	 *	@return  Returns true if isX360FBatchNfIfeeUsed() is "2"
	 */
   public boolean isX360FBatchNfIfeeUsed() throws CFException {
      return (  compareChars( getX360FBatchIchngSw() , x360FBatchNfIfeeUsed88Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setX360FBatchNfIfeeUsedTrue() {  			
    	setX360FBatchIchngSw( x360FBatchNfIfeeUsed88Value);
   	}
	char[] x360FBatchPctIfeeUsed88Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isX360FBatchPctIfeeUsed()
	 *	@return  Returns true if isX360FBatchPctIfeeUsed() is "3"
	 */
   public boolean isX360FBatchPctIfeeUsed() throws CFException {
      return (  compareChars( getX360FBatchIchngSw() , x360FBatchPctIfeeUsed88Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setX360FBatchPctIfeeUsedTrue() {  			
    	setX360FBatchIchngSw( x360FBatchPctIfeeUsed88Value);
   	}
	char[] x360FBatchNobillIfee88Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isX360FBatchNobillIfee()
	 *	@return  Returns true if isX360FBatchNobillIfee() is "4"
	 */
   public boolean isX360FBatchNobillIfee() throws CFException {
      return (  compareChars( getX360FBatchIchngSw() , x360FBatchNobillIfee88Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setX360FBatchNobillIfeeTrue() {  			
    	setX360FBatchIchngSw( x360FBatchNobillIfee88Value);
   	}
	/**
	 *	Returns the value of x360FAcqIfeeAmt
	 *	@return x360FAcqIfeeAmt
	 */   
	 public X360FAcqIfeeAmt getX360FAcqIfeeAmt() {
   	return x360FAcqIfeeAmt;
   }
   /**
	* 	Update X360FAcqIfeeAmt with the passed value
	*   Corresponding COBOL Variable is X360-F-ACQ-IFEE-AMT
	*	@param value
	*/
   public void setX360FAcqIfeeAmt(char[] value) {
      x360FAcqIfeeAmt.setString(value); 
   }   
    
     /**
	 * 	Update X360FAcqIfeeAmt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FAcqIfeeAmt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqIfeeAmt.begin,x360FAcqIfeeAmt.length());
   }
   
     /**
	 * 	Update X360FAcqIfeeAmt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FAcqIfeeAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqIfeeAmt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FAcqIfeeAmt with another Field
	 *	@param value
	 */
   public void setX360FAcqIfeeAmt(Field source) {
   	replace(source,0,source.length(),x360FAcqIfeeAmt.begin,x360FAcqIfeeAmt.length());
   }  
   
     /**
	 * 	Update X360FAcqIfeeAmt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FAcqIfeeAmt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqIfeeAmt.begin,x360FAcqIfeeAmt.length());
   }
   
     /**
	 * 	Update X360FAcqIfeeAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FAcqIfeeAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FAcqIfeeAmt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360FIssIfeeAmt
	 *	@return x360FIssIfeeAmt
	 */   
	 public X360FIssIfeeAmt getX360FIssIfeeAmt() {
   	return x360FIssIfeeAmt;
   }
   /**
	* 	Update X360FIssIfeeAmt with the passed value
	*   Corresponding COBOL Variable is X360-F-ISS-IFEE-AMT
	*	@param value
	*/
   public void setX360FIssIfeeAmt(char[] value) {
      x360FIssIfeeAmt.setString(value); 
   }   
    
     /**
	 * 	Update X360FIssIfeeAmt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360FIssIfeeAmt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssIfeeAmt.begin,x360FIssIfeeAmt.length());
   }
   
     /**
	 * 	Update X360FIssIfeeAmt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FIssIfeeAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssIfeeAmt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360FIssIfeeAmt with another Field
	 *	@param value
	 */
   public void setX360FIssIfeeAmt(Field source) {
   	replace(source,0,source.length(),x360FIssIfeeAmt.begin,x360FIssIfeeAmt.length());
   }  
   
     /**
	 * 	Update X360FIssIfeeAmt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360FIssIfeeAmt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssIfeeAmt.begin,x360FIssIfeeAmt.length());
   }
   
     /**
	 * 	Update X360FIssIfeeAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FIssIfeeAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360FIssIfeeAmt.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getX360DataRecordFieldLength() {
			return X_360_DATA_RECORD_LENGTH;
		}

}
  
