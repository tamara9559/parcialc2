enum peluqueria {

        CORTE("Corte de cabello", "Servicio de corte de cabello", 25),
        UÑAS("Manicura y pedicura", "Servicio de uñas", 10),
        TINTE("Tinte de cabello", "Servicio de tinte para el cabello", 40);


        private String name;
        private String description;
        private Integer price;

    peluqueria(String name, String description, Integer price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public void mostrarDescripcionServicio() {
            System.out.println("Nombre del servicio: " + name);
            System.out.println("Descripción: " + description);
            System.out.println("Precio: $" + price);
        }
    }

