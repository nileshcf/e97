package com.cloudframe.app.repository;

import com.cloudframe.app.d5427dt1.dto.*;
import com.cloudframe.app.data.Field;


public interface D5427dt1Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcladjdClmsfRef
     */
    public void selectAdjdClmsfRef(Sqlca sqlca, DcladjdClmsfRef dcladjdClmsfRef) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrInitFil2D5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrInitFil2D5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFil2D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrNextFil2D5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrNextFil2D5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFil2D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm queryTextArea
     */
    public void prepare(Sqlca sqlca, QueryTextArea queryTextArea) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrInitFullD5427dt1(Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrInitFullD5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFullD5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrInitFiltD5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrInitFiltD5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFiltD5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrNextFullD5427dt1(Sqlca sqlca, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrNextFullD5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFullD5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrNextFiltD5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrNextFiltD5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFiltD5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrInitFil3D5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrInitFil3D5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFil3D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrNextFil3D5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrNextFil3D5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFil3D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrInitFil4D5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrInitFil4D5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFil4D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrNextFil4D5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrNextFil4D5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFil4D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrInitFil5D5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrInitFil5D5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFil5D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrNextFil5D5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrNextFil5D5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFil5D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrInitFil6D5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrInitFil6D5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFil6D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm hostVariables
* @parm dcladjdClmhstDenormRef
     */
    public void openCsrNextFil6D5427dt1(Sqlca sqlca, HostVariables hostVariables, DcladjdClmhstDenormRef dcladjdClmhstDenormRef) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchCsrNextFil6D5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFil6D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openDt1DynCursorD5427dt1(Field sqlda, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvaClmHistArray
* @parm work
     */
    public void fetchDt1DynCursorD5427dt1(Sqlca sqlca, HvaClmHistArray hvaClmHistArray, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeDt1DynCursorD5427dt1(Sqlca sqlca) throws Exception;

}
