package com.cloudframe.app.comput3.dto;

/**
*  The class WcStandardVolumes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WcStandardVolumes extends WcStandardVolumesSerialized { 
   
				private WcBarrels wcBarrels = new WcBarrels();
				private WcKiloBarrels wcKiloBarrels = new WcKiloBarrels();
				private WcLitres wcLitres = new WcLitres();
				private WcCubicMetres wcCubicMetres = new WcCubicMetres();
				private WcUsGallons wcUsGallons = new WcUsGallons();
				private WcUkGallons wcUkGallons = new WcUkGallons();
				private WcMmbtu wcMmbtu = new WcMmbtu();
				private WcGbt wcGbt = new WcGbt();
				private WcThm wcThm = new WcThm();
				private WcMwh wcMwh = new WcMwh();
				private WcHbe wcHbe = new WcHbe();
				private WcDay wcDay = new WcDay();
	
	/**
	* Constructor for WcStandardVolumes
	**/
    public WcStandardVolumes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcStandardVolumes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcStandardVolumes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wcBarrels.setParent(this,getStartOffset() + 0);
	       			wcKiloBarrels.setParent(this,getStartOffset() + 108);
	       			wcLitres.setParent(this,getStartOffset() + 216);
	       			wcCubicMetres.setParent(this,getStartOffset() + 324);
	       			wcUsGallons.setParent(this,getStartOffset() + 432);
	       			wcUkGallons.setParent(this,getStartOffset() + 540);
	       			wcMmbtu.setParent(this,getStartOffset() + 648);
	       			wcGbt.setParent(this,getStartOffset() + 756);
	       			wcThm.setParent(this,getStartOffset() + 864);
	       			wcMwh.setParent(this,getStartOffset() + 972);
	       			wcHbe.setParent(this,getStartOffset() + 1080);
	       			wcDay.setParent(this,getStartOffset() + 1188);
    } 

	/**
	 *	Returns the value of wcBarrels
	 *	@return wcBarrels
	 */   
	 public WcBarrels getWcBarrels() {
   	return wcBarrels;
   }
   /**
	* 	Update WcBarrels with the passed value
	*   Corresponding COBOL Variable is WC-BARRELS
	*	@param value
	*/
   public void setWcBarrels(char[] value) {
      wcBarrels.setString(value); 
   }   
    
     /**
	 * 	Update WcBarrels 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcBarrels(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcBarrels.begin,wcBarrels.length());
   }
   
     /**
	 * 	Update WcBarrels 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcBarrels(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcBarrels.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcBarrels with another Field
	 *	@param value
	 */
   public void setWcBarrels(Field source) {
   	replace(source,0,source.length(),wcBarrels.begin,wcBarrels.length());
   }  
   
     /**
	 * 	Update WcBarrels 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcBarrels(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcBarrels.begin,wcBarrels.length());
   }
   
     /**
	 * 	Update WcBarrels 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcBarrels(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcBarrels.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcKiloBarrels
	 *	@return wcKiloBarrels
	 */   
	 public WcKiloBarrels getWcKiloBarrels() {
   	return wcKiloBarrels;
   }
   /**
	* 	Update WcKiloBarrels with the passed value
	*   Corresponding COBOL Variable is WC-KILO-BARRELS
	*	@param value
	*/
   public void setWcKiloBarrels(char[] value) {
      wcKiloBarrels.setString(value); 
   }   
    
     /**
	 * 	Update WcKiloBarrels 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcKiloBarrels(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcKiloBarrels.begin,wcKiloBarrels.length());
   }
   
     /**
	 * 	Update WcKiloBarrels 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcKiloBarrels(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcKiloBarrels.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcKiloBarrels with another Field
	 *	@param value
	 */
   public void setWcKiloBarrels(Field source) {
   	replace(source,0,source.length(),wcKiloBarrels.begin,wcKiloBarrels.length());
   }  
   
     /**
	 * 	Update WcKiloBarrels 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcKiloBarrels(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcKiloBarrels.begin,wcKiloBarrels.length());
   }
   
     /**
	 * 	Update WcKiloBarrels 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcKiloBarrels(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcKiloBarrels.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcLitres
	 *	@return wcLitres
	 */   
	 public WcLitres getWcLitres() {
   	return wcLitres;
   }
   /**
	* 	Update WcLitres with the passed value
	*   Corresponding COBOL Variable is WC-LITRES
	*	@param value
	*/
   public void setWcLitres(char[] value) {
      wcLitres.setString(value); 
   }   
    
     /**
	 * 	Update WcLitres 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcLitres(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcLitres.begin,wcLitres.length());
   }
   
     /**
	 * 	Update WcLitres 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcLitres(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcLitres.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcLitres with another Field
	 *	@param value
	 */
   public void setWcLitres(Field source) {
   	replace(source,0,source.length(),wcLitres.begin,wcLitres.length());
   }  
   
     /**
	 * 	Update WcLitres 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcLitres(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcLitres.begin,wcLitres.length());
   }
   
     /**
	 * 	Update WcLitres 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcLitres(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcLitres.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcCubicMetres
	 *	@return wcCubicMetres
	 */   
	 public WcCubicMetres getWcCubicMetres() {
   	return wcCubicMetres;
   }
   /**
	* 	Update WcCubicMetres with the passed value
	*   Corresponding COBOL Variable is WC-CUBIC-METRES
	*	@param value
	*/
   public void setWcCubicMetres(char[] value) {
      wcCubicMetres.setString(value); 
   }   
    
     /**
	 * 	Update WcCubicMetres 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcCubicMetres(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcCubicMetres.begin,wcCubicMetres.length());
   }
   
     /**
	 * 	Update WcCubicMetres 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcCubicMetres(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcCubicMetres.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcCubicMetres with another Field
	 *	@param value
	 */
   public void setWcCubicMetres(Field source) {
   	replace(source,0,source.length(),wcCubicMetres.begin,wcCubicMetres.length());
   }  
   
     /**
	 * 	Update WcCubicMetres 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcCubicMetres(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcCubicMetres.begin,wcCubicMetres.length());
   }
   
     /**
	 * 	Update WcCubicMetres 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcCubicMetres(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcCubicMetres.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcUsGallons
	 *	@return wcUsGallons
	 */   
	 public WcUsGallons getWcUsGallons() {
   	return wcUsGallons;
   }
   /**
	* 	Update WcUsGallons with the passed value
	*   Corresponding COBOL Variable is WC-US-GALLONS
	*	@param value
	*/
   public void setWcUsGallons(char[] value) {
      wcUsGallons.setString(value); 
   }   
    
     /**
	 * 	Update WcUsGallons 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcUsGallons(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcUsGallons.begin,wcUsGallons.length());
   }
   
     /**
	 * 	Update WcUsGallons 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcUsGallons(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcUsGallons.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcUsGallons with another Field
	 *	@param value
	 */
   public void setWcUsGallons(Field source) {
   	replace(source,0,source.length(),wcUsGallons.begin,wcUsGallons.length());
   }  
   
     /**
	 * 	Update WcUsGallons 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcUsGallons(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcUsGallons.begin,wcUsGallons.length());
   }
   
     /**
	 * 	Update WcUsGallons 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcUsGallons(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcUsGallons.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcUkGallons
	 *	@return wcUkGallons
	 */   
	 public WcUkGallons getWcUkGallons() {
   	return wcUkGallons;
   }
   /**
	* 	Update WcUkGallons with the passed value
	*   Corresponding COBOL Variable is WC-UK-GALLONS
	*	@param value
	*/
   public void setWcUkGallons(char[] value) {
      wcUkGallons.setString(value); 
   }   
    
     /**
	 * 	Update WcUkGallons 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcUkGallons(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcUkGallons.begin,wcUkGallons.length());
   }
   
     /**
	 * 	Update WcUkGallons 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcUkGallons(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcUkGallons.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcUkGallons with another Field
	 *	@param value
	 */
   public void setWcUkGallons(Field source) {
   	replace(source,0,source.length(),wcUkGallons.begin,wcUkGallons.length());
   }  
   
     /**
	 * 	Update WcUkGallons 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcUkGallons(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcUkGallons.begin,wcUkGallons.length());
   }
   
     /**
	 * 	Update WcUkGallons 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcUkGallons(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcUkGallons.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcMmbtu
	 *	@return wcMmbtu
	 */   
	 public WcMmbtu getWcMmbtu() {
   	return wcMmbtu;
   }
   /**
	* 	Update WcMmbtu with the passed value
	*   Corresponding COBOL Variable is WC-MMBTU
	*	@param value
	*/
   public void setWcMmbtu(char[] value) {
      wcMmbtu.setString(value); 
   }   
    
     /**
	 * 	Update WcMmbtu 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcMmbtu(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcMmbtu.begin,wcMmbtu.length());
   }
   
     /**
	 * 	Update WcMmbtu 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcMmbtu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcMmbtu.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcMmbtu with another Field
	 *	@param value
	 */
   public void setWcMmbtu(Field source) {
   	replace(source,0,source.length(),wcMmbtu.begin,wcMmbtu.length());
   }  
   
     /**
	 * 	Update WcMmbtu 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcMmbtu(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcMmbtu.begin,wcMmbtu.length());
   }
   
     /**
	 * 	Update WcMmbtu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcMmbtu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcMmbtu.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcGbt
	 *	@return wcGbt
	 */   
	 public WcGbt getWcGbt() {
   	return wcGbt;
   }
   /**
	* 	Update WcGbt with the passed value
	*   Corresponding COBOL Variable is WC-GBT
	*	@param value
	*/
   public void setWcGbt(char[] value) {
      wcGbt.setString(value); 
   }   
    
     /**
	 * 	Update WcGbt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcGbt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcGbt.begin,wcGbt.length());
   }
   
     /**
	 * 	Update WcGbt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcGbt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcGbt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcGbt with another Field
	 *	@param value
	 */
   public void setWcGbt(Field source) {
   	replace(source,0,source.length(),wcGbt.begin,wcGbt.length());
   }  
   
     /**
	 * 	Update WcGbt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcGbt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcGbt.begin,wcGbt.length());
   }
   
     /**
	 * 	Update WcGbt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcGbt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcGbt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcThm
	 *	@return wcThm
	 */   
	 public WcThm getWcThm() {
   	return wcThm;
   }
   /**
	* 	Update WcThm with the passed value
	*   Corresponding COBOL Variable is WC-THM
	*	@param value
	*/
   public void setWcThm(char[] value) {
      wcThm.setString(value); 
   }   
    
     /**
	 * 	Update WcThm 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcThm(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcThm.begin,wcThm.length());
   }
   
     /**
	 * 	Update WcThm 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcThm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcThm.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcThm with another Field
	 *	@param value
	 */
   public void setWcThm(Field source) {
   	replace(source,0,source.length(),wcThm.begin,wcThm.length());
   }  
   
     /**
	 * 	Update WcThm 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcThm(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcThm.begin,wcThm.length());
   }
   
     /**
	 * 	Update WcThm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcThm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcThm.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcMwh
	 *	@return wcMwh
	 */   
	 public WcMwh getWcMwh() {
   	return wcMwh;
   }
   /**
	* 	Update WcMwh with the passed value
	*   Corresponding COBOL Variable is WC-MWH
	*	@param value
	*/
   public void setWcMwh(char[] value) {
      wcMwh.setString(value); 
   }   
    
     /**
	 * 	Update WcMwh 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcMwh(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcMwh.begin,wcMwh.length());
   }
   
     /**
	 * 	Update WcMwh 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcMwh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcMwh.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcMwh with another Field
	 *	@param value
	 */
   public void setWcMwh(Field source) {
   	replace(source,0,source.length(),wcMwh.begin,wcMwh.length());
   }  
   
     /**
	 * 	Update WcMwh 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcMwh(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcMwh.begin,wcMwh.length());
   }
   
     /**
	 * 	Update WcMwh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcMwh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcMwh.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcHbe
	 *	@return wcHbe
	 */   
	 public WcHbe getWcHbe() {
   	return wcHbe;
   }
   /**
	* 	Update WcHbe with the passed value
	*   Corresponding COBOL Variable is WC-HBE
	*	@param value
	*/
   public void setWcHbe(char[] value) {
      wcHbe.setString(value); 
   }   
    
     /**
	 * 	Update WcHbe 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcHbe(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcHbe.begin,wcHbe.length());
   }
   
     /**
	 * 	Update WcHbe 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcHbe(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcHbe.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcHbe with another Field
	 *	@param value
	 */
   public void setWcHbe(Field source) {
   	replace(source,0,source.length(),wcHbe.begin,wcHbe.length());
   }  
   
     /**
	 * 	Update WcHbe 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcHbe(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcHbe.begin,wcHbe.length());
   }
   
     /**
	 * 	Update WcHbe 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcHbe(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcHbe.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcDay
	 *	@return wcDay
	 */   
	 public WcDay getWcDay() {
   	return wcDay;
   }
   /**
	* 	Update WcDay with the passed value
	*   Corresponding COBOL Variable is WC-DAY
	*	@param value
	*/
   public void setWcDay(char[] value) {
      wcDay.setString(value); 
   }   
    
     /**
	 * 	Update WcDay 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcDay(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcDay.begin,wcDay.length());
   }
   
     /**
	 * 	Update WcDay 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcDay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcDay.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcDay with another Field
	 *	@param value
	 */
   public void setWcDay(Field source) {
   	replace(source,0,source.length(),wcDay.begin,wcDay.length());
   }  
   
     /**
	 * 	Update WcDay 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcDay(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcDay.begin,wcDay.length());
   }
   
     /**
	 * 	Update WcDay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcDay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcDay.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWcStandardVolumesFieldLength() {
			return WC_STANDARD_VOLUMES_LENGTH;
		}

}
  
