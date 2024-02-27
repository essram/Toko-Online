public interface User {

    // Metode setter
    public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);

    // Metode getter dengan parameter id
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);
}

