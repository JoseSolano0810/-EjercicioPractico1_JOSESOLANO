package examen.josesolano.services;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);    
    final String BucketName = "farmacia-2e2b0.appspot.com";

    final String rutaSuperiorStorage = "farmacia";

    final String rutaJsonFile = "firebase";
    
    final String archivoJsonFile = "farmacia-2e2b0-firebase-adminsdk-u1vaq-c4f008aaa5.json";
}
