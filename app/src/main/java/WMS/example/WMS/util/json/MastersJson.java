package WMS.example.WMS.util.json;

import WMS.example.WMS.repository.local.model.ACCCompany;
import WMS.example.WMS.repository.local.model.BatchMaster;
import WMS.example.WMS.repository.local.model.Principal;
import WMS.example.WMS.repository.local.model.ProductMaster;
import WMS.example.WMS.repository.local.model.RetailCustomerMaster;
import WMS.example.WMS.repository.local.model.SKUMaster;

import java.util.List;

public class MastersJson {

    private List<ProductMaster> productMaster;
    private List<BatchMaster> batchMaster;
    private List<ACCCompany> accCompany;
    private List<RetailCustomerMaster> customer_master;
    private List<Principal> principal;
    private List<SKUMaster> skuMaster;

    public List<SKUMaster> getSkuMaster() {
        return skuMaster;
    }

    public void setSkuMaster(List<SKUMaster> skuMaster) {
        this.skuMaster = skuMaster;
    }

    public List<ProductMaster> getProductMaster() {
        return productMaster;
    }

    public void setProductMaster(List<ProductMaster> productMaster) {
        this.productMaster = productMaster;
    }

    public List<BatchMaster> getBatchMaster() {
        return batchMaster;
    }

    public void setBatchMaster(List<BatchMaster> batchMaster) {
        this.batchMaster = batchMaster;
    }

    public List<ACCCompany> getAccCompany() {
        return accCompany;
    }

    public void setAccCompany(List<ACCCompany> accCompany) {
        this.accCompany = accCompany;
    }

    public List<RetailCustomerMaster> getCustomer_master() {
        return customer_master;
    }

    public void setCustomer_master(List<RetailCustomerMaster> customer_master) {
        this.customer_master = customer_master;
    }

    public List<Principal> getPrincipal() {
        return principal;
    }

    public void setPrincipal(List<Principal> principal) {
        this.principal = principal;
    }
}
