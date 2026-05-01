# Reto: Simulación de flujo de trabajo con GIT_recuperación

Este repositorio contiene la implementación de una calculadora básica en Java, desarrollada bajo una simulación de entorno profesional de empresa para la gestión del ciclo de vida de un software mediante el uso de Git y GitHub.

## 1. Descripción del proyecto
El objetivo principal de este proyecto es aplicar un flujo de trabajo basado en ramas (Git Flow) para gestionar el desarrollo de nuevas funcionalidades, la corrección de errores urgentes y la resolución de conflictos de fusión. El programa consiste en una aplicación Java que permite realizar operaciones matemáticas básicas por consola.

## 2. Ramas utilizadas
Se ha implementado una jerarquía profesional para asegurar la estabilidad del código y organizar el desarrollo de forma aislada:
*   **main**: Rama de producción. Solo contiene el código final, estable y debidamente etiquetado con versiones oficiales.
*   **develop**: Rama principal de desarrollo e integración. Aquí se han fusionado todas las ramas de trabajo antes de pasar a la rama principal.
*   **feature/estructura-calculadora**: Utilizada para crear la arquitectura base del programa y la clase principal.
*   **feature/suma-calculadora**: Rama dedicada a implementar la lógica del método de suma.
*   **fix/error-salida-suma**: Rama de corrección utilizada para subsanar errores de formato en los mensajes y limpiar el código

## 3. Normas de commits
Para mantener un historial de cambios profesional, descriptivo y rastreable, se han seguido las siguientes normas
*   **Mensajes descriptivos**: Cada commit cuenta con un mensaje claro que explica la acción realizada (ej: "Añade el método sumar").
*   **Frecuencia obligatoria**: Se han realizado un mínimo de 2 commits por cada rama de trabajo para documentar el progreso.
*   **Prohibición de trabajo en main**: Se ha respetado estrictamente la norma de no realizar commits directos sobre la rama `main`.

## 4. Explicación del Versionado
El proyecto se ha estructurado en dos hitos de lanzamiento identificados mediante etiquetas (tags):
*   **v0.1 (Primera versión funcional)**: Incluye la estructura Java completa y la funcionalidad de suma totalmente operativa.
*   **v1.0 (Versión final estable)**: Representa la entrega definitiva tras la resolución de conflictos de fusión, la corrección de errores de formato y la limpieza final del código.
