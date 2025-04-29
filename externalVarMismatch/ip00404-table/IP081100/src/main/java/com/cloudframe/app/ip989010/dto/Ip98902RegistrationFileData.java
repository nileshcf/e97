package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip98902RegistrationFileData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip98902RegistrationFileData extends Ip98902RegistrationFileDataSerialized {
   

						@Getter @Setter private char[] ip98902PanAlias = Field.fillLowValue(36);

						@Getter @Setter private char[] ip98902Pan = Field.fillLowValue(16);

						@Getter @Setter private char[] ip98902Status = Field.fillLowValue(1);

								@Getter @Setter private int ip98902DonationAmount;

								@Getter @Setter private int ip98902DonationUpperLimit;

								@Getter @Setter private long ip98902CharityIca;
	
	/**
	* Constructor for Ip98902RegistrationFileData
	**/
    public Ip98902RegistrationFileData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
