package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeNames is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip65504DeNames extends Ip65504DeNamesSerialized { 
   
				@Getter @Setter private Ip65504DeNamesLargeGroup1 ip65504DeNamesLargeGroup1 = new Ip65504DeNamesLargeGroup1();
				@Getter @Setter private Ip65504DeNamesLargeGroup2 ip65504DeNamesLargeGroup2 = new Ip65504DeNamesLargeGroup2();
				@Getter @Setter private Ip65504DeNamesLargeGroup3 ip65504DeNamesLargeGroup3 = new Ip65504DeNamesLargeGroup3();
				@Getter @Setter private Ip65504DeNamesLargeGroup4 ip65504DeNamesLargeGroup4 = new Ip65504DeNamesLargeGroup4();
				@Getter @Setter private Ip65504DeNamesLargeGroup5 ip65504DeNamesLargeGroup5 = new Ip65504DeNamesLargeGroup5();
	
	/**
	* Constructor for Ip65504DeNames
	**/
    public Ip65504DeNames() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip65504DeNames. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNames(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp65504DeNamesLargeGroup1().setParent(this,getStartOffset() + 0);
					getIp65504DeNamesLargeGroup2().setParent(this,getStartOffset() + 244);
					getIp65504DeNamesLargeGroup3().setParent(this,getStartOffset() + 492);
					getIp65504DeNamesLargeGroup4().setParent(this,getStartOffset() + 740);
					getIp65504DeNamesLargeGroup5().setParent(this,getStartOffset() + 988);
    } 

	/**
	 * 	initializes Ip65504DeNames
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp65504DeNamesLargeGroup1().initialize();
     
          getIp65504DeNamesLargeGroup2().initialize();
     
          getIp65504DeNamesLargeGroup3().initialize();
     
          getIp65504DeNamesLargeGroup4().initialize();
     
          getIp65504DeNamesLargeGroup5().initialize();
     
   }


}
  
