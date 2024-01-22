# API-BackEnd-Igreja

## Diagrama de Classe

```mermaid 
classDiagram  
    class Louvores {
        ISBN : string
        Titulo : string
        Autor : string
        Texto : text
    }
    class Admins{
        ID : int
        Nome : string
        Password: string
        Cargo : string
    }
 
    class Requisicoes {
        ID : int
        Livro_ISBN : string
        Admin_ID : int
        Data_Requisicao : date
        Status : string
    }
    
    Admins "1" *-- "N" Louvores
    Admins "1" *-- "N" Requisicoes

```
