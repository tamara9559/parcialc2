package DTO;

import java.io.Serializable;

public class toy {
    public toy(int id, String name, String category, Double price, int amount) {
    }

    public toy() {

    }

    public void setToyName(String newname) {
    }

    public void setCategoryToy(String newcategory) {
    }

    public void setPrice(Double newprice) {
    }

    public void setExistingQuantity(int newamount) {
    }

    public int getExistingQuantity() {
        return 0;
    }

    public class DTO_toy implements Serializable {
        private Integer id;
        private String toyName;
        private String categoryToy;
        private Double price;
        private Integer existingQuantity;

        public DTO_toy(Integer id, String toyName, String categoryToy, Double price, Integer existingQuantity) {
            this.id = id;
            this.toyName = toyName;
            this.categoryToy = categoryToy;
            this.price = price;
            this.existingQuantity = existingQuantity;
        }

        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public String getToyName() {
            return toyName;
        }
        public void setToyName(String toyName) {
            this.toyName = toyName;
        }
        public String getCategoryToy() {
            return categoryToy;
        }
        public void setCategoryToy(String categoryToy) {
            this.categoryToy = categoryToy;
        }
        public Double getPrice() {
            return price;
        }
        public void setPrice(Double price) {
            this.price = price;
        }
        public Integer getExistingQuantity() {
            return existingQuantity;
        }
        public void setExistingQuantity(Integer existingQuantity) {
            this.existingQuantity = existingQuantity;
        }
        @Override
        public String toString() {
            return "Juguete:" +
                    "\n Id=" + id +
                    "\n Nombre del Juguete=" + toyName +
                    "\n Categoría del Juguete=" + categoryToy +
                    "\n Precio=" + price +
                    "\n Cantidad Existente=" + existingQuantity;
        }
    }
}
