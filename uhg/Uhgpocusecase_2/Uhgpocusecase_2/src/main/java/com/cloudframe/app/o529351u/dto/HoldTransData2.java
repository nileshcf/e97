package com.cloudframe.app.o529351u.dto;

/**
*  The class HoldTransData2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HoldTransData2 extends HoldTransData2Serialized { 
   

						@Getter @Setter private char[] fcndPs = new char[2];

						@Getter @Setter private char[] fcndSvc = new char[6];

						@Getter @Setter private char[] fcndCauseCd = new char[1];

						@Getter @Setter private char[] frtoPs = new char[2];

						@Getter @Setter private char[] frtoSvc = new char[6];

						@Getter @Setter private char[] frtoCauseCd = new char[1];

						@Getter @Setter private char[] ptypPs = new char[2];

						@Getter @Setter private char[] ptypSvc = new char[6];

						@Getter @Setter private char[] ptypCauseCd = new char[1];

						@Getter @Setter private char[] ricdPs = new char[2];

						@Getter @Setter private char[] ricdSvc = new char[6];

						@Getter @Setter private char[] ricdCauseCd = new char[1];

						@Getter @Setter private char[] causPs = new char[2];

						@Getter @Setter private char[] causSvc = new char[6];

						@Getter @Setter private char[] causCauseCd = new char[1];

						@Getter @Setter private char[] ripaPs = new char[2];

						@Getter @Setter private char[] ripaSvc = new char[6];

						@Getter @Setter private char[] ripaCauseCd = new char[1];

						@Getter @Setter private char[] cflgPs = new char[2];

						@Getter @Setter private char[] cflgSvc = new char[6];

						@Getter @Setter private char[] cflgCauseCd = new char[1];
	
	/**
	* Constructor for HoldTransData2
	**/
    public HoldTransData2() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HoldTransData2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HoldTransData2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setFcndPs(fillSpace(2));
								setFcndSvc(fillSpace(6));
								setFcndCauseCd(fillSpace(1));
								setFrtoPs(fillSpace(2));
								setFrtoSvc(fillSpace(6));
								setFrtoCauseCd(fillSpace(1));
								setPtypPs(fillSpace(2));
								setPtypSvc(fillSpace(6));
								setPtypCauseCd(fillSpace(1));
								setRicdPs(fillSpace(2));
								setRicdSvc(fillSpace(6));
								setRicdCauseCd(fillSpace(1));
								setCausPs(fillSpace(2));
								setCausSvc(fillSpace(6));
								setCausCauseCd(fillSpace(1));
								setRipaPs(fillSpace(2));
								setRipaSvc(fillSpace(6));
								setRipaCauseCd(fillSpace(1));
								setCflgPs(fillSpace(2));
								setCflgSvc(fillSpace(6));
								setCflgCauseCd(fillSpace(1));
    } 



}
  
